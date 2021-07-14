package com.zpke.transformers.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.zpke.transformers.bean.Column;
import com.zpke.transformers.bean.Table;
import com.zpke.transformers.context.ConfigContext;
import com.zpke.transformers.utils.TransformUtils;

/**
 *    将表定义转化为java实体类java文件
 * @author 28564
 *
 */
public class TransTableToBean {

	/**
	 * @param table
	 * @throws IOException
	 */
	public static void transTableToBean(Table table) throws IOException{
		System.out.println("开始转化表为bean:" + table.getTableName());
		//包名
		String packageName = ConfigContext.getInstance().getPackageName() + ".bean";
		//文件根路径
		String rootPath = ConfigContext.getInstance().getRootPath();
		//方法样式
		String methodType = ConfigContext.getInstance().getMethodType();
		//是否重写equals方法和hashCode方法
		String overrideEquals = ConfigContext.getInstance().getOverrideEquals();
		
		//类名
		String className = TransformUtils.transToHumpNamingFirstUpper(table.getTableName());
		//包路径
		String packagePath = rootPath + "/" + packageName.replace(".", "/");
		
		File packageFile = new File(packagePath);
		if (!packageFile.exists()) {//根据包路径创建文件夹
			packageFile.mkdirs();
		}
		
		//类路径
		String filePath = packagePath  + "/" + className + ".java";
		File file = new File(filePath);
		if (!file.exists()) {//根据类路径创建文件
			file.createNewFile();
		}
		System.out.println("bean文件地址:" + filePath);
		//开始写入java文件
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("package "+ packageName +";\n\n");
		bw.write("public class "+ className +"{\n\n");
		bw.write("\tpublic " + className + "(){\n");
		bw.write("\t}\n\n");
		
		List<Column> columns = table.getColumns();
		
		boolean needOverRideEquals = false;
		String primaryColumnName = "";
		String primaryType = "";
		String primaryPropName = "";
		if(table.getPrimaryKey() != null && "1".equals(overrideEquals)) {
			primaryColumnName = table.getPrimaryKey().getColumnName();
			needOverRideEquals = true;
		}
		
		StringBuffer methodBolck1 = new StringBuffer();
		StringBuffer methodBolck2 = new StringBuffer();
		for (Column column : columns) {
			String name = column.getName();
			String columnType = column.getCodeType();
			String columnName = TransformUtils.transToHumpNaming(name);
			String upperColumnName = TransformUtils.upperFirstChar(columnName);

			if(name.equals(primaryColumnName)) {
				primaryType = columnType;
				primaryPropName = columnName;
			}
			
			bw.write("\tprivate "+ columnType + " " + columnName + ";\n\n");
			String getMethod = "\tpublic "+ columnType + " get" + upperColumnName + "(){\n" +
					           "\t\treturn this." + columnName + ";\n" + 
					           "\t}\n\n";
			String setMethod = "\tpublic void set" + upperColumnName + "("+ columnType + " " + columnName + "){\n" +
							   "\t\t this." + columnName + " = " + columnName + ";\n" +
							   "\t}\n\n";
			if("1".equals(methodType)) {
				methodBolck1.append(getMethod);
				methodBolck1.append(setMethod);
			}else if("2".equals(methodType)) {
				bw.write(getMethod);
				bw.write(setMethod);
			}else if("3".equals(methodType)) {
				methodBolck1.append(getMethod);
				methodBolck2.append(setMethod);
			}
		}
		if(methodBolck1.length() > 0) {
			bw.write(methodBolck1.toString());
		}
		if(methodBolck2.length() > 0) {
			bw.write(methodBolck2.toString());
		}
		bw.newLine();
		
		if(needOverRideEquals) {
			overRideEquals(bw,className,primaryPropName,primaryType);
			overRideHashCode(bw,primaryPropName);
		}
		
		bw.write("}");
		bw.flush();
		bw.close();
		System.out.println("转换完成");
	}
	
	private static void overRideEquals(BufferedWriter bw,String className,String primaryPropName,String primaryType) throws IOException {
		bw.write("\t@Override\n");
		bw.write("\tpublic boolean equals(Object obj) {\n");
		bw.write("\t\tif (this == obj){\n");
		bw.write("\t\t\treturn true;\n");
		bw.write("\t\t}\n");
		bw.write("\t\tif (obj == null){\n");
		bw.write("\t\t\treturn false;\n");
		bw.write("\t\t}\n");
		bw.write("\t\tif (getClass() != obj.getClass()){\n");
		bw.write("\t\t\treturn false;\n");
		bw.write("\t\t}\n");
		bw.write("\t\t" + className + " o = (" + className + ") obj;\n");
		if(TransformUtils.isBasicType(primaryType)) {
			bw.write("\t\tif(" + primaryPropName + " != o.get" + TransformUtils.upperFirstChar(primaryPropName) + "()){\n");
			bw.write("\t\t\treturn false;\n");
			bw.write("\t\t}");
		}else {
			bw.write("\t\tif(" + primaryPropName + " == null && o.get" + TransformUtils.upperFirstChar(primaryPropName) + "() != null){\n");
			bw.write("\t\t\treturn false;\n");
			bw.write("\t\t}else if (!" + primaryPropName + ".equals(o.get" + TransformUtils.upperFirstChar(primaryPropName) + "())){\n");
			bw.write("\t\t\treturn false;\n");
			bw.write("\t\t}\n");
		}
		bw.write("\t\treturn true;\n");
		bw.write("\t}\n");
		bw.newLine();
	}
	
	private static void overRideHashCode(BufferedWriter bw,String primaryPropName) throws IOException {
		bw.write("\t@Override\n");
		bw.write("\tpublic int hashCode() {\n");
		bw.write("\t\tfinal int prime = 31;\n");
		bw.write("\t\tint result = 1;\n");
		bw.write("\t\tresult = prime * result + ((" + primaryPropName + " == null) ? 0 : " + primaryPropName + ".hashCode());\n");
		bw.write("\t\treturn result;\n");
		bw.write("\t}\n");
		bw.newLine();
	}
}

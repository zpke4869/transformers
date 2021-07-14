package com.zpke.transformers.utils;

public class TransformUtils {

	public static String getCodeTypeByDataBaseType(String dataBaseType) {
		String codeType = "";
		switch (dataBaseType) {
		case "tinyint":
		case "smallint":
		case "mediumint":
		case "int":
		case "bigint":
			codeType = "int";
			break;
		case "float":
			codeType = "float";
			break;
		case "double":
			codeType = "double";
			break;
		case "char":
		case "varchar":
		case "tinytext":
		case "text":
		case "mediumtext":
		case "longtext":
		case "date":
		case "time":
		case "datetime":
		case "timestamp":
			codeType = "String";
			break;
		default:
			codeType = "String";
			break;
		}
		return codeType;
	}
	
    public static String transToHumpNaming(String s) {
    	String columnName = "";
		String[] split = s.split("_");
		for (int i = 0; i < split.length; i++) {
			String t = split[i].toLowerCase();
			if (i == 0) {
				columnName += t;
			} else {
				columnName += upperFirstChar(t);
			}
		}
		return columnName;
    }
    
    public static String transToHumpNamingFirstUpper(String s) {
    	String columnName = "";
		String[] split = s.split("_");
		for (int i = 0; i < split.length; i++) {
			String t = split[i].toLowerCase();
			columnName += upperFirstChar(t);
		}
		return columnName;
    }

	public static String upperFirstChar(String t) {
		if(t.length() > 0)
			return (char) (t.charAt(0) - 32) + t.substring(1, t.length());
		else
			return t;
	}
	
	public static boolean isBasicType(String type) {
		if("int".equals(type) || "long".equals(type) || "double".equals(type) || "float".equals(type) 
				|| "char".equals(type) || "byte".equals(type) || "short".equals(type) || "boolean".equals(type)) 
			return true;
		else
			return false;
	}
}

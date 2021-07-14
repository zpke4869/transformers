package com.zpke.test;

import com.zpke.transformers.server.TransformServ;
import com.zpke.transformers.utils.TransformUtils;

public class Test {

	public static void main(String[] args) {
		TransformServ transformServ = new TransformServ();
		transformServ.trans();
		System.out.println(TransformUtils.upperFirstChar("original"));
	}
}

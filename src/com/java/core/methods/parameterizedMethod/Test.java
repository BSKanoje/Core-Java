package com.java.core.methods.parameterizedMethod;

public class Test {
	public static void main(String[] args) {
		
		Method m = new Method();
		m.multiply(10, 10);
		
		System.out.println("---------");
		int mul = m.multiplyReturnPara(10, 100);
		System.out.println(mul);
	}
}

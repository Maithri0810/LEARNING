package com.kodnest.cc.icc;

public class Demo {
	public static void main(String[] args) {
		int i=2;
		mythri:do {
			int j=2;
			charvi:do {
				System.out.print("* ");
				break mythri;
			}while(i>3);
			
		}while(i>3);
		System.out.println();
	}

}

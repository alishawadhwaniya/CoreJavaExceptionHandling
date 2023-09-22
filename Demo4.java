package com.mypracticeofcorejava.exceptionhandling;

public class Demo4 {
	
	public static void main(String[] args) {
		System.out.println("Main method start..");
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method end..");
	}
}

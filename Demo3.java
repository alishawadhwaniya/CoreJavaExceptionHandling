package com.mypracticeofcorejava.exceptionhandling;

class InvalidNumberException extends Exception {

	public InvalidNumberException(String msg) {
		super(msg);
	}
}

public class Demo3 {
	void m2(int a, int b) throws Exception  {
		System.out.println("m2() - started");
//		try {
//			int c = a / b;
//			System.out.println(c);
//		}catch(Exception e) {
//			try {
//				throw new InvalidNumberException("Invalid number");
//			}catch(Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		try {
			int c = a / b;
			System.out.println(c);
		}catch(Exception e) {
			
				throw new InvalidNumberException("Invalid number");
			
		}
		System.out.println("m2() - ended");
	}

	void m1(int a, int b) throws Exception {
		System.out.println("m1() - started");
		
			m2(a, b);
		
		System.out.println("m1() - ended");
	}

	public static void main(String[] args)  {
		System.out.println("main() - method started");
		
			Demo3 d = new Demo3();
			
				
					try {
						d.m1(10, 0);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			
		 
		System.out.println("main() - method ended");
	}
}

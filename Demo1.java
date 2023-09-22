package com.mypracticeofcorejava.exceptionhandling;

public class Demo1 {
	public String getName(int id) throws Exception  {
		if(id==101) {
			return "Raju";
		}else if(id==102) {
			return "Rani";
		}else {
			throw new Exception("Invalid id");
		}
	}
	public static void main(String[] args) throws Exception  {
		Demo1 d=new Demo1();
		
			String name=d.getName(101);
			System.out.println(name);
		
			String name1=d.getName(200);
			System.out.println(name1);
		
		
	}
}

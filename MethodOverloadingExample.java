package com.kavitha.examples2;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample s= new MethodOverloadingExample();
		System.out.println(s.MethodOverloadingExample(5,6));
		System.out.println(s.MethodOverloadingExample(6,7,9));
	
	}
     public int MethodOverloadingExample(int i,int j)
     {
    	 return (i+j);
     }
     public int MethodOverloadingExample(int i,int j,int k)
     {
    	 return(i+j+k);
     }

}

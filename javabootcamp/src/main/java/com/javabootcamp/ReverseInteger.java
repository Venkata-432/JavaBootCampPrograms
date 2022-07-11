package com.javabootcamp;

public class ReverseInteger {
	 public static void main(String[] args) {
		
		 int num=30145;
		 int rem;
		 int res=0;
		 System.out.println("Given Number= "+ num);
		 
		 while (num>0) {
			 rem=num%10;
			 
			 res=(res*10)+rem;
			 num=num/10;
			 
		 }
		 
		 System.out.println("Reverse Integer Number= "+res);
	 }
}

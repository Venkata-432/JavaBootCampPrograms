package com.javabootcamp;

import java.util.Scanner;

public class FactorialNumber {
 public static void main(String[] args) {
   
	 Scanner sc=new Scanner(System.in);
	 
	 int num=sc.nextInt();
	 int fact=1;
	 for(int i=num;i>0;i--) {
		 
		 fact=fact*(num);
		 num--;
	 }
	 
	 System.out.println("Factorial of a given number= "+fact);
 }
}

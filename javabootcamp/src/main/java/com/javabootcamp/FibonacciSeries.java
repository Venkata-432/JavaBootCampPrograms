package com.javabootcamp;

public class FibonacciSeries {

	public static void main(String[] args){

		  int lower=1;
		  int upper=20;

		  int n1=lower,n2=2;
		  System.out.print(n1+" "+n2+" ");
		  int n3=n1+n2;

		  while(n3<=upper){

		   n3=n1+n2;
		   n1=n2;
		   n2=n3;

		   if(n3<=20 && n3>=1) {
			   System.out.print(n3+" ");
		   }
		   
		}
	}
}

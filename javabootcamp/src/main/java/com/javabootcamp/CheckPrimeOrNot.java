package com.javabootcamp;

public class CheckPrimeOrNot {

	public static void main(String[] args) {

			int num=13,count=0;

			for(int i=2;i<=num/2;i++){
				
				if(num%i==0) {
					count++;
					break;
				}
			}

			if(count==0 && num!=0) {
				System.out.println(num+" is a prime number");
			}else {
				System.out.println(num+" is not a prime number");
			}
    }

}

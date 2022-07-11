package com.javabootcamp;

public class SumOfOddIntegers {
 public static void main(String[] args) {
	
	 int sumOfOddNumbers=0;
	 for(int i=1;i<99;i++) {
		 
		 if(i%2==0) {
			 continue;
		 }else {
			 sumOfOddNumbers=sumOfOddNumbers+i;
		 }
	 }
	 
	 System.out.println("Sum of Odd Integers from 1 to 99= "+sumOfOddNumbers);
}
}

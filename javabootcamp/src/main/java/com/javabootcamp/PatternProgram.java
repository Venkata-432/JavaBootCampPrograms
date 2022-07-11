package com.javabootcamp;

public class PatternProgram {

	public static void main(String[] args) {
		
       for(int i=1;i<=7;i++) {
    	   int num=0;
    	   for (int j=1;j<=i;j++) {
    		   if(j==1) {
    			   System.out.print(num+" ");
    		   }else {
    			   num=num+i;
    			   System.out.print(num+" ");
    		   }
    		   
    	   }
    	   System.out.println();
       }
	}
}

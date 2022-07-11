package com.javabootcamp;

import java.util.Scanner;

public class GradeSeparation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int marksPercentage=sc.nextInt();

		if(marksPercentage<35){
		  System.out.println("Grade= F");
		}else if(marksPercentage>=35 && marksPercentage<50){
		  System.out.println("Grade= D");
		}else if(marksPercentage>=50 && marksPercentage<60){
		  System.out.println("Grade= C");
		}else if(marksPercentage>=60 && marksPercentage<75){
		  System.out.println("Grade= B");
		}else if(marksPercentage>=75){
		  System.out.println("Grade= A");
		}

	}

}

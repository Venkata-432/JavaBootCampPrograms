package com.javabootcamp;

public class PrintingName {
	public static void main(String[] args){

		String name="Venkat";
		int i=1;
		while (i<=10)
		{
			int j=1;
			while(j<=10)
			{
				System.out.print(name+ "  ");
				j++;
			}
			System.out.println();
			i+=1;
		}
	}
}


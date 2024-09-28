package com.patterns;

public class Abstarct_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==4)
					System.out.print("* ");
				else
					System.out.print("& ");
			}
			//The condition if(i==2||i==4) determines
			//whether to print an asterisk (*) or an ampersand (&) based on the row number.
			System.out.println();
		}

	}

}

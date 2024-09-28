package com.patterns;

public class Alphabet_column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=65;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print((char)(j+n)+" ");
			}
			System.out.println();
		}

	}




}

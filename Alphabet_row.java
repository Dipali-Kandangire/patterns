package com.patterns;

public class Alphabet_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=65;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print((char)(i+n)+" ");
			}
			System.out.println();
		}

	}

}

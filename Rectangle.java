package com.patterns;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	}



/*rules:
 * 1.apply nested for loop:
	->outer for loop->inner for loop
    ->outer loop for rows
    ->inner loop for column
 * 2.no.of rows !=no.of column
 * -> i<j=horizontal rectangle
 * -> i>j=vertical rectangle
 */
 
 
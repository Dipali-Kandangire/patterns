package com.patterns;

public class Square {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
/*square pattern rule:
1.apply nested for loop:
	->outer for loop->inner for loop
    ->outer loop for rows
    ->inner loop for column
2.no.of rows=no.of columns   
*/
package com.patterns;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*triangular pattern rules:
 * 1.apply nested for loop:
	->outer for loop->inner for loop
    ->outer loop for rows
    ->inner loop for column
 * 2.
 * -> i<=n 
 * -> i<=i 
 */

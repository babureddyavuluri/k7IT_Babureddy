package com.Babu;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 24;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				int l = ++k;
				if (i == j) {
					System.out.print(a[i][j] = l);
				} else if (i + j == a.length - 1) {
					System.out.print(a[i][j] = l);
				} else {
					System.out.print(" * ");
				}

			}
			System.out.println();
			
		}
		
	}

}

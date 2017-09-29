package org.HackerRank.CrackingTheCodingInterview;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * 
 * @author masud
 *
 */

public class ArraysLeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int i = 0; i < k; i++) {
			int temp = a[0];
			for (int j = 0; j < n - 1; j++) {
				a[j] = a[j + 1];
			}
			a[n - 1] = temp;
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}

package org.HackerRank_PracticeInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/programming-interview-questions/challenges/fibonacci-lite/submissions/code/1303426597
 * 
 * @author masud
 *
 */

public class FibboNacciLite {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(solution(a));

	}

	public static int solution(int n) {
		List<Integer> sum = new ArrayList<>();
		sum.add(0);
		sum.add(1);
		for (int i = 2; i <= n; i++) {
			int x = sum.get(i - 1) + sum.get(i - 2);
			sum.add(x);
		}
		return sum.get(n);
	}
}

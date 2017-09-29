package org.HackerRank_PracticeInterview;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/programming-interview-questions/challenges/factorial-n/submissions/code/1303427116
 * 
 * @author masud
 *
 */
public class Factorials {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger fact = BigInteger.valueOf(1);
		while (n > 0) {
			fact = fact.multiply(BigInteger.valueOf(n));
			n--;
		}
		System.out.println(fact);
		scan.close();
	}
}

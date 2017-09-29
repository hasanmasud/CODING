package org.HackerRank_PracticeInterview;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * https://www.hackerrank.com/contests/programming-interview-questions/challenges/fizzbuzz-classic/problem
 * 
 * @author masud
 *
 */
public class FizzBuzzClassic {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		LongStream.rangeClosed(1, n).forEach(each -> {
			String str = "";
			if (each % 3 == 0) {
				str += "Fizz";
			}
			if (each % 5 == 0) {
				str += "Buzz";
			}
			if (str.length() > 0) {
				System.out.println(str);
			} else {
				System.out.println(each);
			}
		});
		scan.close();

	}

}

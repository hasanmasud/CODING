package org.HackerRank_PracticeInterview;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FibonacciReturns {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while (scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		Map<Integer, BigInteger> map = new HashMap<>();
		solution(map, Collections.max(list));
		for (int n : list) {
			System.out.println(map.get(n));
		}
	}

	public static void solution(Map<Integer, BigInteger> map, int n) {
		map.put(0, BigInteger.valueOf(0));
		map.put(1, BigInteger.valueOf(1));
		for (int i = 2; i <= n; i++) {
			BigInteger x = map.get(i - 1).add(map.get(i - 2));
			map.put(i, x);
		}
	}

}

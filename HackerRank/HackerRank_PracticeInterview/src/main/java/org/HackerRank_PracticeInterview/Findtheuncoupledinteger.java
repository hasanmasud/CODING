package org.HackerRank_PracticeInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findtheuncoupledinteger {
	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		List<Integer> list = Arrays.asList(str.split(",")).stream().map(each -> Integer.parseInt(each.trim()))
				.collect(Collectors.toList());
		int lonelyInt = 0;
		for (int i : list) {
			lonelyInt ^= i;
		}
		System.out.println(lonelyInt);
	}

}

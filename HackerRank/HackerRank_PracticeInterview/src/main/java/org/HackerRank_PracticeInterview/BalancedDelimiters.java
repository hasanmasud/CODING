package org.HackerRank_PracticeInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedDelimiters {

	private static Map<Character, Character> mapchar = new HashMap<>();

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		mapchar.put(Character.valueOf('('), Character.valueOf(')'));
		mapchar.put(Character.valueOf('{'), Character.valueOf('}'));
		mapchar.put(Character.valueOf('['), Character.valueOf(']'));
		System.out.println(balancedDelimiter(str));
	}

	private static boolean isCorrectDelim(Character c1, Character c2) {
		if (c1 == null || c2 == null) {
			return false;
		}
		return mapchar.get(c1) == c2;
	}

	private static String balancedDelimiter(String str) {
		Stack<Character> stack = new Stack<>();
		char[] charray = str.toCharArray();
		for (char c : charray) {
			Character cobj = null;
			try {
				cobj = stack.peek();
			} catch (EmptyStackException emptyStackException) {
			}
			if (cobj == null) {
				stack.push(c);
			} else {
				if (isCorrectDelim(cobj, c)) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		return (stack.isEmpty()) ? "True" : "False";
	}

}

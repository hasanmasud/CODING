package org.HackerRank.CrackingTheCodingInterview;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	private static Map<Character, Character> mapchar = new HashMap<>();
	static {
		mapchar.put(Character.valueOf('('), Character.valueOf(')'));
		mapchar.put(Character.valueOf('{'), Character.valueOf('}'));
		mapchar.put(Character.valueOf('['), Character.valueOf(']'));
	}

	private static boolean isCorrectDelim(Character c1, Character c2) {
		if (c1 == null || c2 == null) {
			return false;
		}
		return mapchar.get(c1) == c2;
	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		char[] charray = expression.toCharArray();
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
		return (stack.isEmpty()) ? true : false;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

}

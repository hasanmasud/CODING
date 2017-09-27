package org.hackerrank.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-anagrams?h_r=next-challenge&h_v=zen
 * 
 * @author masud
 *
 */
public class Anagram {

	static <V> boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() != b.length()) {
			return false;
		}

		Map<Character, Integer> a1 = new HashMap<Character, Integer>();
		Map<Character, Integer> b1 = new HashMap<Character, Integer>();
		fillMap(a1, a);
		fillMap(b1, b);
		for (int i = 0; i < a.length(); i++) {
			Character c = Character.toLowerCase(a.charAt(i));
			if (a1.get(c) != b1.get(c)) {
				return false;
			}
		}
		return true;
	}

	public static void fillMap(Map<Character, Integer> map, String s) {
		for (int i = 0; i < s.length(); i++) {
			Character c = Character.toLowerCase(s.charAt(i));
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + Integer.valueOf(1));
			} else {
				map.put(c, Integer.valueOf(1));
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}

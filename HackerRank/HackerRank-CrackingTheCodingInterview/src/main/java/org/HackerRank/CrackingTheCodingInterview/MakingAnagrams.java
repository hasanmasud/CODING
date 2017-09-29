package org.HackerRank.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
		int count = 0;
		final Map<Character, Integer> firstMap = new HashMap<>();
		final Map<Character, Integer> secondMap = new HashMap<>();
		IntStream.range(0, first.length()).map(i -> first.charAt(i)).forEach(c -> {
			Character co = Character.valueOf((char) c);
			Integer i = firstMap.get(co) == null ? Integer.valueOf(1) : firstMap.get(co).intValue() + 1;
			firstMap.put(co, i);
		});

		IntStream.range(0, second.length()).map(i -> second.charAt(i)).forEach(c -> {
			Character co = Character.valueOf((char) c);
			Integer i = secondMap.get(co) == null ? Integer.valueOf(1) : secondMap.get(co).intValue() + 1;
			secondMap.put(co, i);
		});
		count = 0;
		for (Character c : firstMap.keySet()) {
			if (secondMap.containsKey(c)) {
				count += getCount(firstMap.get(c) - secondMap.get(c));
				secondMap.remove(c);
			} else {
				count += firstMap.get(c);
			}
		}
		for (Entry<Character, Integer> each : secondMap.entrySet()) {
			count += each.getValue();
		}
		return count;
	}

	private static int getCount(int i) {
		if (i < 0) {
			i = i * -1;
		}
		return i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}

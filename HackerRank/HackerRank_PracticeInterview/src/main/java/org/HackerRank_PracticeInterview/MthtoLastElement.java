package org.HackerRank_PracticeInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MthtoLastElement {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int x = Integer.parseInt(a);
		List<Integer> list = new ArrayList<>();
		while (scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		if (x > list.size()) {
			System.out.println("NIL");
			return;
		}
		System.out.println(list.get(list.size() - x));
	}

}

package com.csmarton.hackerrank.algorithms.implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DivSumPairs
{
	public static void main(String[] args)
	{
		//String input = "6 3\n" + "1 3 2 6 1 2";

		String input = "100 66\n"
				+ "50 44 77 66 70 58 9 59 74 82 87 15 10 95 10 81 2 4 87 85 28 96 76 18 86 91 94 "
				+ "59 19 58 98 48 38 70 36 38 66 9 72 54 23 23 17 18 8 16 9 56 12 59 73 31 10 62 83 84 28 91 29 22 73 22 3 75 26 31 93 57 15 32 46 74 99 10 15 58 60 53 41 49 71 59 4 20 38 78 1 94 76 5 70 68 42 34 77 28 19 25 20 15";

		Scanner in = new Scanner(input);
		int n = in.nextInt();
		int k = in.nextInt();
		LinkedList<Integer> integers = new LinkedList();

		for (int a_i = 0; a_i < n; a_i++) {
			integers.add(in.nextInt());
		}

		int numOfGoods = 0;

		Iterator outerIterator = integers.iterator();

		while (outerIterator.hasNext()) {
			int first = (Integer)outerIterator.next();
			outerIterator.remove();

			Iterator innerIterator = integers.iterator();
			while (innerIterator.hasNext()) {
				int second = (Integer)innerIterator.next();

				if (checkDivisibility(first, second, k)) {
					numOfGoods++;
				}
			}
		}

		System.out.println(numOfGoods);
	}

	private static boolean checkDivisibility(int first, int second, int divide)
	{
		if ((first + second) % divide == 0) {
			return true;
		} else {
			return false;
		}
	}
}

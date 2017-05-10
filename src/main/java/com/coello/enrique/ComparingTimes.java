package com.coello.enrique;

import java.util.Scanner;

public class ComparingTimes {
	static String timeCompare(String t1, String t2) {
		int hour1 = Integer.parseInt(t1.substring(0, 2));
		boolean ampm1 = t1.substring(5, 7).contains("PM");

		if (hour1 == 12 && !ampm1) {
			hour1 = 0;
		} else if (hour1 != 12 && ampm1) {
			hour1 += 12;
		} else {
			hour1 = hour1;
		}

		int minute1 = Integer.parseInt(t1.substring(3, 5));
		hour1 += (ampm1 && hour1 != 12 ? 12 : 0);
		int f1 = (60 * hour1) + minute1;

		int hour2 = Integer.parseInt(t2.substring(0, 2));
		boolean ampm2 = t2.substring(5, 7).contains("PM");

		if (hour2 == 12 && !ampm2) {
			hour2 = 0;
		} else if (hour2 != 12 && ampm2) {
			hour2 += 12;
		} else {
			hour2 = hour2;
		}

		int minute2 = Integer.parseInt(t2.substring(3, 5));
		hour2 += (ampm2 && hour2 != 12 ? 12 : 0);
		int f2 = (60 * hour2) + minute2;

		return (f1 > f2 ? "Second" : "First");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int a0 = 0; a0 < q; a0++) {
			String t1 = in.next();
			String t2 = in.next();
			String result = timeCompare(t1, t2);
			System.out.println(result);
		}

		in.close();
	}
}

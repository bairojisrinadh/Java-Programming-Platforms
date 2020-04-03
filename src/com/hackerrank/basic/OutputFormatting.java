package com.hackerrank.basic;

import java.util.Scanner;

/*
 * java 100
	cpp 65
	python 50
 */
public class OutputFormatting {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("================================");
			for (int i = 0; i < 3; i++) {
				String s1 = sc.next();
				int x = sc.nextInt();

				int len = s1.length();
                while (len++ < 15) {
                    s1 += " ";
                }

                String digit = "";
                if (x < 10) {
                    digit = "00" + String.valueOf(x);
                } else if (x < 100) {
                    digit = "0" + String.valueOf(x);
                } else {
                    digit = String.valueOf(x);
                }

                System.out.printf("%s%s\n", s1, digit);
			}
			System.out.println("================================");
		}
	}
}

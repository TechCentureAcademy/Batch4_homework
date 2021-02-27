
package session2Loop;

import java.lang.reflect.Array;
import java.util.Scanner;

import session3Loop.numbers;

public class N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Write a program to get the sum of first 20 odd numbers using a for loop

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int oddSum = 0;

		for (int i = 0; i < 20; i++)

			if (numbers[i] % 2 != 0) {

				oddSum = oddSum + numbers[i];
				System.out.println();	
			}
		System.out.println("The Sum of Odd Numebers in given Array=  " + oddSum);

	}
	
}

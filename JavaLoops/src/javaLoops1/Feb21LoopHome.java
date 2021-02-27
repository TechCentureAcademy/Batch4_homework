package javaLoops1;

import java.util.Arrays;

public class Feb21LoopHome {
//	 Write a program to get the sum of first 20 odd numbers using a for loop

	public static void main(String[] args) {
		int requestedOdds = 20;
		
		int sum = 0;
		for (int i = 1; i / 2 < requestedOdds; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}


// for(int j = 0; j<=37; j++) {
 //  if(j % 2 == 0) {
	//   system.out.printLn(j);
   
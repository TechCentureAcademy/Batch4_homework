package Loops;

import java.util.Scanner;

public class First_Loop_Practice {
	
	public static void main(String[] args) {
		
		
		
		int number1 = 1;
		while (number1 > 1) {
			
		}
		
		int[] numbers = {1, 3, 6, 7, 3, 6 };
		int sum = 0;
		
		
	    for(int index = numbers.length -1; index >= 0; index --) {
	    	sum += numbers[index];
//	    	System.out.println(sum);
	    }
	    
	 // print all the even numbers until 37;
	    for (int i = 1; i <= 40; i+=2) {
			System.out.println(i);
		}
	    
	    for(int j = 0; j <= 37; j++) {
	    	if(j % 2 == 0) {
	    		System.out.println(j);
	    	}
	    }
		
	    // See you at 8:20 PM EST
	    
	    /*
	     *    5. Write a program that takes string elements into a String array. Size of the array will be different depending on the user input.
		 * Using the for loop, find out the element that has the largest length. Slightly harder than you think
		 * 
		 * e.g
		 * How many elements: 4
		 *                              3    5    4     7
		 * enter element 1: abc
		 * enter element 2: fadkg
		 * enter element 3: pakd
		 * enter element 4: sfsdfkjdf
		 * 
		 * output: largest element is sfsdfkjdf
	     * 
	     * 
	     * Solutions:
	     * 
	     * 1. Divide array into 2 smaller arrays and compare
	     * 
	     * --------------------------------------------------
	     * 
	     * 2. Create int array to store length of each word
	     * 
	     * 
	     */
	    // user provides the number
	    Scanner scan = new Scanner(System.in);
	    System.out.println("How many elements: ");
	    int number = scan.nextInt();
	    String[] words = new String[number]; //number goes here
	    
	    // Nata: 2 dimentional loop then find the largest
	    // Golib: look by max.length identify longest string 
	    
	    // We can create another array and store length of each string inside
	    int[] length = new int[words.length];
	    
	    
	   // 4 numbers, how to find the largest?
	   // Max method
	    
	    for(int index = 0; index < words.length; index++) {
	    	length[index] = words[index].length();
	    	
	    }
	}
	
	
	/*
	 *    Verify if purchase is allowed or not
	 *    
	 *    ask for a account balance
	 *    
	 *    Example:
	 *    User entered $100000
	 *    
	 *    array withdraw  1000, 50000, 20000
	 * 
	 *    
	 *    
	 * 
	 * 
	 * 
	 */

}

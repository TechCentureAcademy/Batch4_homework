package assinments;

import java.util.Scanner;

public class AssignmentForloop2 {
	
	public static void main(String[] args) {
		
			int i,n=0,s=0;
			double avg;
			{
			   
		        System.out.println("Input the 9 numbers : ");  
		         
			}
				for (i=0;i<9;i++)
				{
				    Scanner in = new Scanner(System.in);
				    n = in.nextInt();
				    
		  		s +=n;
			}
			avg=s/9;
			System.out.println("The sum of 9 numbers is : " +s+"\nThe Average is : " +avg);
		 
		}
		}

	




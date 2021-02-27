package assinments;

import java.util.Scanner;

public class AssignmentArrays4 {

	public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("How many names would you like to enter in this array?: ");
        int numName = inp.nextInt();
        String nameArray[] = new String[numName];
        System.out.println("Enter the names: ");

    for(int i = 0; i <= nameArray.length; i++){
          nameArray[i] = inp.nextLine();
        }
        System.out.println(nameArray.length);
    }
	
	
	
	
	
	
}

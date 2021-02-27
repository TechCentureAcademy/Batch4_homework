package practicing;

public class MyHomeWork {

	public static void main(String[] args) {
		// find the values of x, y, j and k without printing them 
		// int x = 120/2;
		// int y = x * 5 - x/6;
		// int j = (x + y) * 3;
		// int k = x + y + j;
		// k--;
		// ++x;
		// y++;
		// --j;	

		int x = 120/2; // 60
		int y = x * 5 - x/6; //  60*5 - 60/6 = 290
		int j = (x + y) * 3; //(60 +290) * 3 = 1050
		int k = x + y + j; //60 + 290 + 1050 = 1400
		k--; // 1399
		
		++x; // 61
		
		y++;//291
		
		--j;	//1049
		
		
//Create an int variable called miles and assign 120 to it. Then create a byte variable called milesByte and assign miles to milesByte		
		int miles = 120;
		byte milesByte = (byte) miles;
		
		//3. Create an int variable called count and assign 5 initially. On the next line, increment the value of count by 
int count = 5;
count += 3;
count = count/2;
count -= 1;

//Create an int variable called number and assign it with 19. Then divide it by 4 and multiply the remainder by 3. Next, divide the product
// by 3 and print out the result in floating number e.g., 1.111111	

int number = 19;
number = number%4;

number = number *3;
number = number/3;
double d = number/3.0;
System.out.println((double)number); // this means outcasting. it will turn the int result into double

double price = 46.87;
int prize = (int) price; //it prints as a whole number
System.out.println(prize);


	
	
	
	
	
	
	
	}

}

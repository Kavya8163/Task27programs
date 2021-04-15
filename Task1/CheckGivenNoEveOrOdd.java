/*Check given number is even or odd*/
package Task1;

import java.util.Scanner;

public class CheckGivenNoEveOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		//Define variables
		int X = sc.nextInt();
		if(X %2 == 0)
		{
			System.out.println("Enter the value is Even");
		}
		else
		{
			System.out.println("Enter the value is Odd");
		}
	
		
		
	}

}

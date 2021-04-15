/*Given Number is Polyndrome Or Not*/

package Task1;
import java.util.Scanner;
public class GivenNoPolyNdromeOrNot {
	public static void main(String[] args) {
		System.out.println("Enter the Value of n");
		Scanner sc = new Scanner(System.in);
		int r,sum = 0,temp;
		int n = sc.nextInt();
		temp =n;
		while(n>0)
		{
			r = n%10;//getting Reminder
			sum = sum*10+r;
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("Given Number is Polndrome");
		}
		
		else
		{

			System.out.println("Given Number is not a Polndrome");
		}
		
		
		
		
	}

}

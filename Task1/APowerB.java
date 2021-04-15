
/*18.Java Program to find Power of a Number By using Iteration*/
package Task1;
import java.util.Scanner;
public class APowerB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int power =1;
		for(int i = 1;i<=b;i++)
		{
			power = power*a;
		}
			
		System.out.println("the final result of "+a+"power"+b+" = "+power);
	}
	

}

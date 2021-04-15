
/*17.Factorial of a Given Number using  Iteration*/
package Task1;
import java.util.Scanner;
public class FactorialOfGivenNo {
	public static void main(String[] args) {
		int i,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for( i = 1;i<=num;i++)
		{
			fact = fact*i;
		}
				
				
				
				
			System.out.println("Factorial of "+num+" is "+fact);	
				
				
				
	}

}




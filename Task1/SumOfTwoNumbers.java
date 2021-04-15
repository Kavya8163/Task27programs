/*11.Sum of Two Numbers (take two numbers as Input)*/
package Task1;
import java.util.Scanner;
public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int num1 ,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		sum = num1+num2;
		System.out.println("Sum of Two Numbers "+sum);
	
	}
	

}

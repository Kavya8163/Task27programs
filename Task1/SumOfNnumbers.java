/*16.Sum of first n numbers */

package Task1;
import java.util.Scanner;


public class SumOfNnumbers {
	public static void main(String[] args) {
	int sum = 0;
		System.out.println("Enter the Number Value::");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0;i<num;i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of n value of numbers "+sum);
	}

}

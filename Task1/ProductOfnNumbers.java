
/*15.Product 1 of n numbers (take n values as input)*/

package Task1;
import java.util.Scanner;


public class ProductOfnNumbers {
	public static void main(String[] args) {
	int product = 1;
		System.out.println("Enter the Number Value::");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++)
		{
			product = product*i;
		}
		System.out.println("Product of n value of numbers "+product);
	}

}


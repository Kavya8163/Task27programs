/*21.Largest Among 2 Numbers(take 2 values as Input)*/

package Task1;
import java.util.Scanner;
public class LargestAmong2Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.println("/n the largest Number = "+num1);
		}
		else if(num2>num1)
		{
			System.out.println("/n the largest Number = "+num2);
		}
		
		else
		{
			System.out.println("/n both are Equal");
		}
	}

}

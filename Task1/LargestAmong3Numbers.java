/*22.Largest Among 3 Numbers(take 3 values as Input)*/

package Task1;

import java.util.Scanner;

public class LargestAmong3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int x = sc.nextInt();
		System.out.println("Enter the Second Number");
		int y = sc.nextInt();
		System.out.println("Enter the third Number");
		int z = sc.nextInt();
		if(x>y &&x>z)
		{
			System.out.println("/n the largest Number = "+x);
		}
		else if(y>z)
		{
			System.out.println("/n the largest Number = "+y);
		}
		
		else
		{
			System.out.println("/n Largest Number ="+z);
		}
	}

}


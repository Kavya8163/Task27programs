/*23.Largest Among n numbers(take n values as input)*/
package Task1;
import java.util.*;
public class LargestAmongNvaLUES {
	public static void main(String[] args)
	{
		
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int largest = Integer.MIN_VALUE;
		System.out.println("the values are");
		for(int i = 0;i<n;i++)
		{
			int current = sc.nextInt();
			if(current>largest)
			{
				largest = current;
			}
		}
		System.out.println("largest of N numbers is ::::::::::"+largest);
	}
}
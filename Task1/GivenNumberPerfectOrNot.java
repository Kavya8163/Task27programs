
/*Check Given Number is PerfectNumber Or Not*/
package Task1;
import java.util.Scanner;


public class GivenNumberPerfectOrNot {
	
	public static void main(String[] args)
	{
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int n = sc.nextInt();
		for(int i = 1;i<n;i++)
		{
			if(n%i == 0)
			{
			sum = sum+i;
		
	}
	}
	if(sum == n)
	{
		System.out.println("Given number is Perfect");
	}
	else
	{
		System.out.println("Given number is not  Perfect");	
	}

}
}

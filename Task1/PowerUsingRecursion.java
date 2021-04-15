/*20.Java Program to find Power of a Number By using Recursion*/

package Task1;

public class PowerUsingRecursion {
	public static void main(String[] args) {
		int a = 3, b = 4;
		int result = power(a,b);
		System.out.println(a+ "power"+b+"="+result);
	}
	public static int power(int a,int b)
	{
		if(b != 0)
		{
			//recursive call to Power()
			return(a*power(a,b-1));
		}
		else
		{
			return 1;
		}
	}
	

}

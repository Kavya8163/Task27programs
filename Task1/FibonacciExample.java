/*Fibonacci Series Example */
package Task1;

public class FibonacciExample {
	public static void main(String[] args) {
		int n1 = 0,n2 = 1,n3,i,count =14
				;
		System.out.println(n1+" "+n2);
		for( i = 2;i<count;i++)//loop starts from 2 because 0 and 1 are already Printed
		{
			n3 = n1+n2;
			System.out.println(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}

}

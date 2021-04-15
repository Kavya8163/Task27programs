
/*Reverse Digits of a Give Number 456 654*/
package Task1;
import java.util.Scanner;
public class ReverseDigit456654 {
	public static void main(String[] args) {
		int a,m=0, sum =0;
		int n = 456;
		do
		{
			a = n%10;
			m = m*10+a;
			sum = sum+a;
			n = n/10;
		}
		while(n>0);
		System.out.println("Reverse :::::"+m);
	}
	}
	
/*9.Check Given String is Polyndrome Or Not*/

package Task1;
import java.util.Scanner;
public class CheckPolyndrome {
public static void main(String[] args) {
	String  rev = "";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.nextLine();
	int length = str.length();
	for(int i = length-1;i>=0;i--)
		rev = rev+str.charAt(i);
	if(str.equals(rev))
	{
		System.out.println(str+ " is a polinderome");
	}
	else
	{
		System.out.println(str+ " is not a polinderome");
	}
}
}

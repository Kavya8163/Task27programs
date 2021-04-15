/*Swapping values of Two Variables Without using Third Variables*/

package Task1;
import java.util.*;
public class SwapWithOutUse3rd {
	public static void main(String[] args) {
		System.out.println("Enter values of X and Y");
		Scanner sc = new Scanner(System.in);
		//Define variables
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before Swapping numbers ::"+x+" and "+y);
		/*Swapping*/
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After Swapping numbers ::"+x+" and "+y);
	}
}

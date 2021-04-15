
/*8.Reverse the String
satya -> aytas
soos -> soos*/
package Task1;

public class ReverseTheString {
	public static void main(String[] args) {
		String s1 = "satya";
		String s2 = "soos";
		System.out.println("After the Reverse the String is ::::::::");
		for(int i = s1.length();i>0;i--)
		{
			System.out.print(s1.charAt(i-1));
		}
		System.out.println();
		for(int i = s2.length();i>0;i--)
		{
			System.out.print(s2.charAt(i-1));
		}
	}

}

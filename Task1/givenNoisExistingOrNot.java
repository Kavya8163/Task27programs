
/*Find a given number is existing or not in the Array*/
package Task1;

public class givenNoisExistingOrNot {
	public static void main(String[] args) {
		int[] num = {1,23,45,67,90};
		int toFind = 68;
		boolean found = false;
		for(int n :num)
		{
			if(n == toFind)
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println(toFind +" is found");
		}
		else
		{
			System.out.println(toFind +" is not found");
		}
	}

}

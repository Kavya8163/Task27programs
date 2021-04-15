/*24.Largest Among n numbers(take n values as input into Array*/
package Task1;

public class LargestAmongNusingArray {
	public static void main(String[] args) {
		int[] a1 = new int[] {22,3,45,567,89};
		int max = a1[0];
		for(int i = 1;i<a1.length;i++)
		{
			if(a1[i] >max)
				max = a1[i];
		}
		System.out.println("The given Array is:");
		for(int i = 0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println("The largest Number is "+max);
	}

}

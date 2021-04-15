
/*25.find 2nd largest among n numbers(taken values as input into array*/
package Task1;

public class SecondLargeNumber {
	public static void main(String[] args) {
		int temp;
		int array[] = {10,20,30,35,67,89};
		int size = array.length;
		for(int i = 0;i<size;i++)
		{
			for(int j = i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Second Largest Number is ::::::::::"+array[size-2]);
		
	}

}

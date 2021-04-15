
	/*12.Sum of Two Numbers (take Three numbers as Input)*/

	package Task1;
	import java.util.Scanner;
	public class SumOfThreeNumbers {
		public static void main(String[] args) {
			int num1 ,num2,num3,sum;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first Number");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			num2 = sc.nextInt();
			System.out.println("Enter Third Number");
			num3 = sc.nextInt();
			sum = num1+num2+num3;
			System.out.println("Sum of Three Numbers "+sum);
		
		}
		

	}




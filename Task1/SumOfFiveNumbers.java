
	/*13.Sum of Five Numbers (take Five numbers as Input)*/

	package Task1;
	import java.util.Scanner;
	public class SumOfFiveNumbers{
		public static void main(String[] args) {
			int num1 ,num2,num3,num4,num5,sum;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first Number");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			num2 = sc.nextInt();
			System.out.println("Enter Third Number");
			num3 = sc.nextInt();
			System.out.println("Enter Fourth Number");
			num4 = sc.nextInt();
			System.out.println("Enter Fifth Number");
			num5 = sc.nextInt();
			
			sum = num1+num2+num3+num4+num5;
			System.out.println("Sum of Five  Numbers "+sum);
		
		}
		

	}






import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			
			System.out.println("enter the 1st number");
			int a=sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("enter the 2nd number");
			int c=sc.nextInt();
			
			if(a>b &&a>c) {
				System.out.println("the largest number is ="+a);
			}
			else if(b>a &b>c)
				System.out.println("the largest number is ="+b);
			else
				System.out.println("the largest number is ="+c);
			
			
			
			
		}

	}

}

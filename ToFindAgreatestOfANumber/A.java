package ToFindAgreatestOfANumber;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first no");
		int a=scan.nextInt();
		System.out.println("Enter the second no");
		int b=scan.nextInt();
		System.out.println("Enter the third no");
		int c=scan.nextInt();
		if (a>b&&a>c) {
			System.out.println("A is greator");
		}
		else if (b>c&&b>a) {
			System.out.println("B is greator");
		}
		else {
			System.out.println("C is greator");
		}
	}

}
//5 marks
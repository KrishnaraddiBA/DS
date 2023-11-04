package ProgramToCheckEvenOrOddno;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=scan.nextInt();
		if (no%2==0) {
			System.out.println("It is even no");
		}
		else {
			System.out.println("It is not an even no");
		}
	}

}
//5
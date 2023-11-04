package ProgramToReverseANumber;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=scan.nextInt();

		int rem;
		int rev=0;
		while (no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	
	}

}
//5
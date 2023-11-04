package FactorialOfANumber;

import java.util.Scanner;

//By using recursion method
public class B {
	static int mul=1;
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no");
	int no=scan.nextInt();
	recursion(no);
	
	System.out.println(mul);
	}
	public static void recursion(int no) {
if (no>0) {
	mul=mul*no;
	recursion(no-1);
}

		
	}
}
//10
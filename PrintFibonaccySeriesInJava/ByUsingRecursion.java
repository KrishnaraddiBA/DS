package PrintFibonaccySeriesInJava;

import java.util.Scanner;

public class ByUsingRecursion {
	static int c;
	static int a=0;static int b=1;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=scan.nextInt();
		Fibonaccy(no);
	}

	public static void Fibonaccy(int no) {
		if (no>0) {
			c=a+b;
			System.out.println(c);
			a=b;b=c;
			Fibonaccy(no-1);
		}
		
		
		
		
	}

}
//10
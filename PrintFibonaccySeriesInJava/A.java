package PrintFibonaccySeriesInJava;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int a=0;int b=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the last no u want to print like fibonaccy");
		int no=scan.nextInt();
		int c;
		for (int i = 1; i <=no ; i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
			
		}
	}

}

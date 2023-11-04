package ToSwapWithOrWithOutThirdVariable;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1 st no");
		int a=scan.nextInt();
		System.out.println("Enter the 2 nd no");
		int b=scan.nextInt();
		System.out.println("Before swapping a is "+a);
		System.out.println("Before swapping b is "+b);
		//By using third variable
		
		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		
		//with out using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		//after swapping no is 
		System.out.println("After swapping a is "+a);
		System.out.println("After swapping b is "+b);
		
	}

}
//5
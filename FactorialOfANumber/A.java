package FactorialOfANumber;

import java.util.Scanner;

//with out using recursion
public class A {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=scan.nextInt();
		
		int mul=1;
//		for (int i = no; i >0; i--) {
//			mul=mul*i;
//		}
		//anather format using for loop
		
		for (int i = 1; i <=no; i++) {
			mul=mul*i;
			
		}
		
		System.out.println(mul);
	}

}

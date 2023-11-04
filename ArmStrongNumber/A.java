package ArmStrongNumber;

import java.util.Scanner;

public class A {
	
	//armstrong means=153=1*1*1+5*5*5+3*3*3=153
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=scan.nextInt();
		int t1=no;int t2=no;
		String size = String.valueOf(no);
		int size1 = size.length();
		System.out.println(size1);
		int rem;
		int arm=0;
		int mul;;
		while (t2!=0) {
			mul=1;
			rem=t2%10;
			for (int i = 1; i <= size1; i++) {
				mul=mul*rem;
			}
			
			arm=arm+mul;
			t2=t2/10;
		}
		if (arm==t1) {
			System.out.println("It is an armstrong ");
		}
		else {
			System.out.println("It is not an armstrong");
		}
	}

}

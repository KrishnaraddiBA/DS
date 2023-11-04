package CheckNoIsPrimeOrNot;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=scan.nextInt();
		int temp=0;
		for (int i = 2; i <= no-1; i++) {
			if (no%i==0) {
				temp=temp+1;
			}
			
		}
		if (temp>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("no prime");
		}
	}

}
//0
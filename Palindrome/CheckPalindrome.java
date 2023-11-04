package Palindrome;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		String s1 = String.valueOf(no);
	
	int size = s1.length();
	int t1=no;
	int t2=no;
	int rev=0;
	int rem;
	while(t2!=0) {
		rem=t2%10;
		rev=rev*10+rem;
		t2=t2/10;
	}
	if (rev==t1) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("It is not an palindrome");
	}
	}

}

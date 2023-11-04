package ReverseAString;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.next();
		int size = s1.length();
		char[]c2=new char[size];
		for (int i = s1.length()-1; i >=0; i--) {
			c2[i]=s1.charAt(size-1-i);
		}
		String s2 = String.valueOf(c2);
		System.out.println("the reverse of a string is  "+s2);
	} 

}
//5
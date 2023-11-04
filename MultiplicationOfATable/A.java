package MultiplicationOfATable;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no which u want to get the table");
		int a=scan.nextInt();
		for (int i = 1; i <=10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
			
		}
	}
//5
}

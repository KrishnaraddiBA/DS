package LeapYearOrNot;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scan.nextInt();
		if (year%400==0&&year%100!=0||year%4==0) {
			System.out.println("It is leap year");
		}
		else{
		System.out.println("It is not an leap year");
		}
	}
//5
}

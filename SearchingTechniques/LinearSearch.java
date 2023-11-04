package SearchingTechniques;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no to search");
		int no=scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (no==a[i]) {
				System.out.println("The number found in " +i+" index location");
				break;
			}
			
		}
	}

}

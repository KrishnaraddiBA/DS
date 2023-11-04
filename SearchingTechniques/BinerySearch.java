package SearchingTechniques;

import java.util.Scanner;

public class BinerySearch {
	public static void main(String[] args) {
		int []a= {10,20,50,60,40,30,25};
		int li=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int finNo=scan.nextInt();
		
		int hi=a.length-1;
		int mi=(li+hi)/2;
		for (int i = 0; i < a.length; i++) {
			if (a[mi]==finNo) {
				System.out.println("The location found at index "+mi);
				break;
			}
			else if (a[mi]<finNo) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	}

}

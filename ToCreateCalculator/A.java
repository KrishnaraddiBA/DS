package ToCreateCalculator;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		boolean flag=true;
		while (flag) {
		System.out.println("Press 1 to add");
		System.out.println("Press 2 to sub");
		System.out.println("Press 3 to mul");
		System.out.println("Press 4 to div");
		
		System.out.println("Select the key");
		int key =scan.nextInt();
		A a1=new A();
		
		switch (key) {
		case 1:
		
			System.out.println("Enter the first no");
			int c=scan.nextInt();
			System.out.println("Enter the second no");
			int d=scan.nextInt();
			a1.add(c,d);
			break;

		case 2:
			System.out.println("Enter the first no");
			int a=scan.nextInt();
			System.out.println("Enter the second no");
			int b=scan.nextInt();
			a1.sub(a,b);
			break;
			
		case 3:
			System.out.println("eNTER THE FIRST NO");
			int e=scan.nextInt();
			System.out.println("Enter the second no");
			int f=scan.nextInt();
			a1.mul(e,f);
			break;
		case 4:
			System.out.println("Enter the first no");
			int r=scan.nextInt();
		System.out.println("Enter the second no");
		int i=scan.nextInt();
		a1.div(r,i);
		break;
		default:
			System.out.println("Hog ba");
			flag=false;
			
			
			
			break;
		}
		
		}
	}

	public void div(int r, int i) {
		// TODO Auto-generated method stub
		
		System.out.println("The div of the no is "+r/i);
	}

	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The mul of the number is "+a*b);
		
	}

	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The sub of the no is "+(a-b));
		
	}

	public void add(int c, int d) {
		// TODO Auto-generated method stub
		
		System.out.println("The addition of the no is "+(c+d));
	}
}//10

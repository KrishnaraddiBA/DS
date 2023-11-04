package SumOfAnnonymousArray;

public class A {

	
	public static void main(String[] args) {
		int []a=new int[] {1,2,3,4,5};
	int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}

package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[]a= {10,20,30,80,50,40,60,60};
		int temp=0;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				count=count+1;
				}
			}
			if (count==0) {
				break;
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

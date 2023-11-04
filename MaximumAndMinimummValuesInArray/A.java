package MaximumAndMinimummValuesInArray;

public class A {
	public static void main(String[] args) {
		int[]a= {10,50,60,40,30,80,90};
		int min;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			min=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println("The maximum of an array is "+a[a.length-1]);
		System.out.println("The minimum of an array is "+a[0]);
		System.out.println("The second largest of the number is "+a[a.length-2]);
		System.out.println("The second lowest of the number is "+a[1]);
		
	}

}

package MergeTwoArrayInAnArray;

public class A {

	
	public static void main(String[] args) {
		int []a= {10,20,50,60,40,30};
		int b[]= {70,80,90,40,30};
		int csize=a.length+b.length;
		int []c=new int[csize];
		
	for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[a.length+i]=b[i];
	}
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}

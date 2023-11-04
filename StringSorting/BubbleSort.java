package StringSorting;

public class BubbleSort {
public static void main(String[] args) {
	String[] s1= {"krishnaraddi","basavaraddi","hanumaraddi","venkaraddi","basvaraddi1"};
	String temp;
	int count=0;
	for (int i = 0; i < s1.length; i++) {
		for (int j = 0; j < s1.length-1-i; j++) {
			if (s1[j].compareTo(s1[j+1])>0) {
				temp=s1[j];
				s1[j]=s1[j+1];
				s1[j+1]=temp;
				count=count+1;
			}
			
		}
		if (count==0) {
		break;	
		}
		
	}
	
	for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);
	}
}
}

package StringSorting;

public class SelectionSort {
	public static void main(String[] args) {
		String[] s1= {"basavaraddi","vittalraddi","vemaraddi","umeshraddi","gopalraddi","shashidharraddi","timmaraddi"};
		int min;
		String temp;
		for (int i = 0; i < s1.length; i++) {
			min=i;
			for (int j = i+1; j < s1.length; j++) {
				if(s1[j].compareTo(s1[min])<0) {
					min=j;
				}
			}
			temp=s1[i];
			s1[i]=s1[min];
			s1[min]=temp;
			
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}

}

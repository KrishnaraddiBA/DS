package DuplicateElementsInAnArray;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	//to find a duplicate elements in an array
	
	
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,80,9,07,70,20,30,60,40};
		Map<Integer, Integer>  map=new LinkedHashMap<Integer, Integer>();
		int i=0;
		int size = a.length;
		while (i!=size) {
			if (map.containsKey(a[i])==false) {
				map.put(a[i], 1);
			}
			else {
				Integer oldval = map.get(a[i]);
				int newval=oldval+1;
				map.put(a[i], newval);
			}
			++i;
		}
		Set<Integer>  set=new LinkedHashSet<Integer>();
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
//			if (entry.getValue()>1) {
//				System.out.println(entry.getKey());
//			}//this is for duplicates of an array
			
//			if (entry.getValue()==1) {
//				System.out.println(entry.getKey());
//				System.exit(0);
//			}//non duplicates that found out first
			
			
//			if (entry.getValue()>1) {
//				System.out.println(entry.getKey());
//				System.exit(0);//first duplicate character
//				
//			}

			set.add(entry.getKey());
			
		}
	
		for (Integer entry2 : set) {
			System.out.println(entry2);
		}//removed a dupicate elements in an array
	}

}

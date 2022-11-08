package week5day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,2,3,4};
		
		Set<Integer> uniqueNumber=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			uniqueNumber.add(num[i]);
			
		}
		System.out.println(uniqueNumber);
		
	}

}

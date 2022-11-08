package week5day1;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuppllicate {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,4,5};
		Set<Integer> duplicate=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					duplicate.add(num[i]);
				}
				
			}
			
		}
		System.out.println(duplicate);
		}

}

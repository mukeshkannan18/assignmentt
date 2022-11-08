package week5day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] num= {5,33,2,66,1,9,8};
		
		Set<Integer> emp=new TreeSet<Integer>();
		for(int i=0;i<num.length-1;i++) {
			emp.add(num[i]);
		}	
	List<Integer> num1=new ArrayList<Integer>(emp);
	int size=num1.size();
	System.out.println(size);
	
	
	Integer value=num1.get(size-2);
	System.out.println(value);
	
		}
		
		
	
	}

	
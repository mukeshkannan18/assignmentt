package week5day1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate2 {
public static void main(String[] args) {
	String name="testleaf";
	char[] stringname=name.toCharArray();
	Arrays.sort(stringname);
	Set<Character> name1=new TreeSet<>();
	for (int i = 0; i < stringname.length; i++) {
		name1.add(stringname[i]);
		
	}
	System.out.println(name1);
}
}

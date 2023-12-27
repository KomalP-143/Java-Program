package komal.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringCompare {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest="";
		String largest="";
		List<String>a = new ArrayList<>();
		
		for(int i=0;i<s.length()-k+1;i++) {
			a.add(s.substring(i,i+k));
		}
		Collections.sort(a);
		smallest = a.get(0);
		largest = a.get(a.size()-1);
		return smallest +"\n" +largest;
	}
	

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String s =sc.next();
	int k =sc.nextInt();
	System.out.println(getSmallestAndLargest(s,k));
	}

}

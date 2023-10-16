package komal.com;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		String str;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		str = sc.next();
		System.out.println("Reversed string");
		for(int j = str.length(); j>0; --j) {
			System.out.print(str.charAt(j-1));
		}

	}

}

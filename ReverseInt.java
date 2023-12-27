package komal.com;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, res=0,n;
	System.out.println("enter a number");
	n = sc.nextInt();
	
	while(n!=0) {
		a = n%10;
		res =(res * 10)+a;
		n = n/10;
	}
	System.out.println("rev at a number " +res);

	}

}

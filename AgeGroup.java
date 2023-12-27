package komal.com;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		if(age>0 && age <12) {
			System.out.println("child");
		}else if(age>17 && age <18){
			System.out.println("Teen");
		}else{
			System.out.println("Adult");
		}

	}

}

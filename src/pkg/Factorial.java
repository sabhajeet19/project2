package pkg;

import java.util.Scanner;

public class Factorial {
	int calculateFactorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return(n*calculateFactorial(n-1));
		}
	}

	public static void main(String[] args) {
		Factorial facto = new Factorial();
		System.out.println("Enter number to get factorial:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int result = facto.calculateFactorial(n);
		System.out.println("Factorial of "+n+" ="+(result));

	}

}

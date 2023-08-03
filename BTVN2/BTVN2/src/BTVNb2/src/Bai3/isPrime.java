package Bai3;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		if (n == 1) System.out.println(n + " k la so nguyen to"); 
		else {
			boolean k = true;
			for (int i = 2; i*i <= n; i++) {
				if (n % i == 0) {
					k = false;
					break;
				}
			}
			
			if (k == true) System.out.println(n  + " la so nguyen to");
			else System.out.println(n + " k la so nguyen to");
			
		}
		
	}

}

package Bai2;

import java.util.Scanner;
import Bai2.a;
import Bai2.b;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println("S = " + a.S(n));
		System.out.println("P = " + b.P(n));
	}

}

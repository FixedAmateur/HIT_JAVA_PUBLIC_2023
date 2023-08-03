package Bai5;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so chanh: "); int a = scan.nextInt();
		System.out.println("Nhap so tao: "); int b = scan.nextInt();
		System.out.println("Nhap so le: "); int c = scan.nextInt();
		
		int b0 = (b - b%2)/2;
		int c0 = (c - c%4)/4;
		
		System.out.println("Tong so qua toi da: " + 7 * Math.min(a, Math.min(c0, b0)));
		
		
		
	}

}

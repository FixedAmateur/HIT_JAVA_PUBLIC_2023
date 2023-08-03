package Bai4;

import java.util.Scanner;

public class Bai4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap a: "); double a = scan.nextDouble();
		System.out.println("Nhap b: "); double b = scan.nextDouble();
		System.out.println("Nhap c: "); double c = scan.nextDouble();
		
		double d = b*b - 4*a*c ;
		
		System.out.print( "Phuong trinh " );
		if (a == 0) System.out.print("ko dung dinh dang");
		else if (d < 0) System.out.print( "vo nghiem" );
		else if (d == 0) 
			if (-b/2*a > 0) System.out.print("co 4 nghiem giong nhau la " 
					+ Math.sqrt(-b/2*a));
			else System.out.print("vo nghiem") ;
		else {	
			System.out.print( "cac nghiem phan biet " );
			double x1 = (- b - Math.sqrt(d))/2*a;
			double x2 = (- b + Math.sqrt(d))/2*a;
			if ( x1 >= 0 ) System.out.print( "\n" + Math.sqrt(x1) + "\n" + (-Math.sqrt(x1)) );
			if ( x2 >= 0 ) System.out.print( "\n" + Math.sqrt(x2) + "\n" + (-Math.sqrt(x2)) );
		}
	}

}

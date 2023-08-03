package Bai2;

public class a {
	
	public static double S(int n){
		double sum = 0;
		for (int i = 1 ; i < n ; i++) {
			sum += (double) 1.0/i;
		}
		return sum;
	}

}

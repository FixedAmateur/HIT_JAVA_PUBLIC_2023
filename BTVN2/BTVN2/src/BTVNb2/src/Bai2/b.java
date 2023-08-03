package Bai2;

public class b {
	
	public static long factor(int n) {
		long sum = 0;
		long f = 1;
		for (int i = 1 ; i < n ; i++) {
			f *= (long)i;
			sum += f;
		}
		return sum;
	}
	
	public static long P(int n){
		return factor(n);
	}
}

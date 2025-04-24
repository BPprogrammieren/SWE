package swe;

public class Exercise1 {
	static void Ulam(int n) {
		int t  = 0;
		int x = n;
		while (x != 1) {
			t++;
			if (x%2 == 0) x=x/2;
			else x = x/3 + 1;
		}
		System.out.println("Function is terminated after " + t + " time(s)");
	}
	public static void main(String[] args) {
		int n = 6;
		Ulam(n);

	}

}

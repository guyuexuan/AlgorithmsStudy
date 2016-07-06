package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print(gcd(1111111,1234567));
	}
	public static int gcd(int p, int q)
	{
		StdOut.print(p + " " + q);
		StdOut.println("");
		if (q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}
}

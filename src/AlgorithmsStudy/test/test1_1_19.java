package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_19 {
	public static long[] temp = new long[100000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int N = 0; N < 100; N++)
			StdOut.println(N + " " + F(N));
	}
	
	public static long F(int N)
	{
		if (N == 0) return 0;
		if (N == 1) return 1;
		if (temp[N] != 0) return temp[N];
		long result = F(N-1) + F(N-2); 
		temp[N] = result;
		return result;
	}
	
}

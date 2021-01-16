package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print(mystery(2, 25) + " ");
		StdOut.print(mystery(3, 11) + " ");
		StdOut.print(mystery2(2, 25) + " ");
		StdOut.print(mystery2(3, 11)+ " ");
	}
	
	public static int mystery(int a, int b)//return a * b;
	{
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery(a+a, b/2);
			return mystery(a+a, b/2) + a;
	}
	
	public static int mystery2(int a, int b)
	{
		if (b == 0) return 1;
		if (b % 2 == 0) return mystery(a+a, b/2);
			return mystery(a+a, b/2) * a;
	}
}

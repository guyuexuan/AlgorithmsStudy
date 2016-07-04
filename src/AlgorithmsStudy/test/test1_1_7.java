package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
		t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		StdOut.println(sum);
		int a = (1 + 999)*999/2;
		StdOut.println(a);
		int sum2 = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum2++;
		StdOut.println(sum2);
		
		
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
		
		int N = 234;
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		StdOut.println(s);
		
		
		int[] a2 = new int[10];
		for (int i = 0; i < 10; i++)
			a2[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a2[i] = a2[a2[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(i);
		
	}
	

}

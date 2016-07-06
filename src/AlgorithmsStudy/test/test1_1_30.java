package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		boolean[][] data = boolArray(N);
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				StdOut.print(data[i][j]+" ");
			}
			StdOut.println("");
		}
	}
	public static boolean[][] boolArray(int N)
	{
		boolean[][] data = new boolean[N][N];
		
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
			{
				if(gcd(i,j) == 1)
					data[i][j] = true;
				else
					data[i][j] = false;
			}
		return data;
	}
	
	public static int gcd(int p, int q)
	{
		if(p == 0 || q == 0)
		{
			return 1;
		}
		if(p % q == 0)
		{
			return q;
		}
		else
		{
			return gcd(q, p%q);
		}
	}
}

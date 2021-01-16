package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{2,3,1},{8,2,6},{1,8,2},{6,4,8}};
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				StdOut.print(a[i][j] + " ");
			}
			StdOut.print("\n");
		}
		//StdOut.print(a.length);
		change(a);
		
		for(int i = 0; i < a[0].length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				StdOut.print(a[j][i] + " ");
			}
			StdOut.print("\n");
		}
	}
	public static void change(int[][] a)
	{
		int[][] b = new int[a[0].length][a.length];
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[0].length; j++)
			{
				b[j][i] = a[i][j];
			}
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				StdOut.print(b[i][j] + " ");
			}
			StdOut.print("\n");
		}
			
	}
}

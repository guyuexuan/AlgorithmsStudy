package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] x = {{true,false,true},{false,true,true},{false,true,true}};
		printbool(x);
	}
	public static void printbool(boolean[][] x)
	{
		int a = x.length;
		int b = x[0].length;
		StdOut.print(" ");
		for(int i = 0; i < b; i++)
		{
			StdOut.print(i+ " ");
		}
		StdOut.print("\n");
		for(int i = 0; i < a;i++)
		{
			StdOut.print(i);
			for(int j = 0; j < b;j++)
			{
				if(x[i][j])
					StdOut.print("* ");
				else
					StdOut.print("  ");
			}
			StdOut.print("\n");
		}
	}

}

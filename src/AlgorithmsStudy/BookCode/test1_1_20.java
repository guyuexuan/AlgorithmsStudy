package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print( lnFunction(2));
	}
	
	public static double lnFunction(long N)
	{
		if(N > 1)
		{
			return Math.log(N)+ lnFunction(N - 1);
		}
		else
			return 0;
	}
}

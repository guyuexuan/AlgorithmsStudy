package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,3,4,1,52,5};
		int[] b = hsitogram(a , 5);
		for(int i = 0; i < b.length; i++){
			StdOut.print(b[i]+" ");
		}
		
		StdOut.print(exR1(6));  //311361142246
	}
	
	public static int[] hsitogram(int[] a, int M)
	{
		int[] x = new int[M];
		for(int i = 0; i < a.length; i++){
			if(a[i] < M)
			{
				x[a[i]]++;
			}
		}
		return x;
	}
	
	public static String exR1(int n)
	{
		if (n <= 0) return "";
			return exR1(n-3) + n + exR1(n-2) + n;
	}
}

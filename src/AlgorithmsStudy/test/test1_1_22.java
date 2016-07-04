package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		rank(4, a);
	}
	public static int rank(int key, int[] a)
	{ 
		return rank(key, a, 0, a.length - 1, 0); 
	}
	public static int rank(int key, int[] a, int lo, int hi,int depth)
	{
		for(int j = 1; j < depth; j++)
			StdOut.print(" ");
		StdOut.print(depth);
		StdOut.print(" " + lo + " " + hi + " ");
		StdOut.println("");
		//如果key存在于a[]中，它的索引不会小于lo且不会大于hi
		if (lo > hi) 
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) 
			return rank(key, a, lo, mid - 1, ++depth);
		else 
			if (key > a[mid]) return rank(key, a, mid + 1, hi, ++depth);
			else return mid;
	}
	public static int rank2(int key, int[] a, int lo, int hi,char n)
	{
		//如果key存在于a[]中，它的索引不会小于lo且不会大于hi
		if (lo > hi) 
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) 
			return rank(key, a, lo, mid - 1,);
		else 
			if (key > a[mid]) return rank(key, a, mid + 1, hi, ++depth);
			else return mid;
	}
}

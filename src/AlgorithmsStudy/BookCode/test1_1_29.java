package AlgorithmsStudy.test;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class test1_1_29 {
	
	public static void main(String[] args)
	{
		In in = new In("tinyW");
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);
		int key = StdIn.readInt();
		int cnt = rank(key,whitelist);
		StdOut.println("smaller than " + key + " element have " + cnt);
		int cntequal = count(key,whitelist);
		StdOut.println("equal " + key + " element have " + cnt);
	}
	
	public static int rank(int key, int[] a)
	{ // 数组必须是有序的
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{   // 被查找的键要么不存在，要么必然存在于a[lo..hi] 之中
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) 
				hi = mid - 1;
			else 
				if (key > a[mid]) 
					lo = mid + 1;
				else
				{
					while(a[mid] == a[mid-1] && mid > 0)
						mid--;
					return mid;
				}
		}
		return -1;
	}
	
	public static int count(int key, int[] a)
	{
		int n = 0;
		int i = rank(key, a);
		while(a[i] == a[i+1] && i < a.length)
		{
			n++;
			i++;
		}
		return n;
	}
}

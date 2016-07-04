package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class test1_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test3(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		if(test3(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])))
		{
			StdOut.print("equal");
		}
		else
		{
			StdOut.print("not equal");
		}
	}
	
	public static Boolean test3(int a, int b, int c)
	{
		if(a == b)
		{
			if(a == c)
				return true;
			else
				return false;
		}
		else
			return false;
	}

}

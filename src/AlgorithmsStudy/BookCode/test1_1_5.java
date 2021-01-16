package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class test1_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(judge(Double.parseDouble(args[0]))&&judge(Double.parseDouble(args[1])))
			StdOut.print("true");
		else
			StdOut.print("false");
	}
	
	public static Boolean judge(double a)
	{
		if(a > 0 && a < 1)
			return true;
		else
			return false;
	}

}

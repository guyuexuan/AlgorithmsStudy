package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print(ln(485));
	}
	 public static int ln(int n) {
		 // TODO Auto-generated method stub
		 int m = 1;
		 int i = 0;
	     for(i = 0;m <= n;i++){
	    	 m = m * 2;
	    	 }
	     return i-1;
	     }
}

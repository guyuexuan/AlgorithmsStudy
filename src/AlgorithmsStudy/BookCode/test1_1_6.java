package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ì³²¨ÄÇÆõÊıÁĞ
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++)
		{
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}

}

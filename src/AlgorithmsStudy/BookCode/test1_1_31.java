package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class test1_1_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rand(Integer.parseInt(args[0]),Double.parseDouble(args[1]));
	}
	public static void rand(int N, double p)
	{
		double[][] data = new double[N][2];
		
		StdDraw.setXscale(0,50*2);
		StdDraw.setYscale(0,50*2);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.005);
		StdDraw.circle(50, 50, 50);
		
		for(int i = 0; i<N ; i++)
		{
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.setPenRadius(0.005);
			double m = 50 - 50 * Math.cos(2*Math.PI*i/N);
			double n = 50 - 50 * Math.sin(2*Math.PI*i/N);
			StdDraw.point(m, n);
			data[i][0] = m;
			data[i][1] = n;
		}
		
		StdDraw.setXscale(0,50*2);
		StdDraw.setYscale(0,50*2);
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.setPenRadius(0.01);
		for(int i = 0; i<N ; i++)
			for(int j = 0; j<N ; j++)
			{
				if(StdRandom.bernoulli(p))
					StdDraw.line(data[i][0], data[i][1], data[j][0], data[j][1]);
			}
	}
}

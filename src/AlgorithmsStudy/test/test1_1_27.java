package AlgorithmsStudy.test;

import edu.princeton.cs.algs4.StdOut;

public class test1_1_27 {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StdOut.print(count);
		//binomial(100,50,0.5);
		//StdOut.print(count);
		StdOut.print(binomialArrays(100,50,0.5));
	}
	public static double binomial(int N, int k, double p)
	{
		count++;
		StdOut.print(count);
		if (N == 0 && k == 0) 
			return 1.0; 
		if (N < 0 || k < 0) 
			return 0.0;
		return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1,p);
	}
	
	public static double binomialArrays(int N, int k, double p)
	{
		if(N < 0 || k < 0)
			return 0.0;
		double[][] data = new double[N+1][k+1];
		data[0][0] = 1;
		for(int i = 1; i < N+1; i++)
		{
			data[i][0] = data[i-1][0]*(1 - p);
		}
		for (int i=0;i<N+1;i++)    
			for(int j=1;j<=i&&j<k+1;j++)
				data[i][j]= (1-p)*data[i-1][j]+p*data[i-1][j-1];
		return data[N][k];
	}
}

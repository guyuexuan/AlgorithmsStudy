package AlgorithmsStudy.test;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class test1_1_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while(StdIn.hasNextLine()){
			//String name = StdIn.readString();
			//int firnum = StdIn.readInt();
			//int secnum = StdIn.readInt();
		//}
		String[] str = StdIn.readAllStrings();//将文件中的字符串读取到数组中
		for(int i = 0; i < str.length; i = i + 3)
		{
			StdOut.print(str[i] + "  " + str[i+1] + "  " + str[i+2] + "  ");
			double m = Double.parseDouble(str[i+1]);
			double n = Double.parseDouble(str[i+2]);
			StdOut.printf("%.3f",m/n);
			StdOut.println("");
		}
	}
}

package AlgorithmsStudy.test;

public class test1_1_28 {
	static int num = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int countRe(int[] a)
	{
		int cnt = 0;
		for(int i = 0; i < a.length-1; i++)
		{
			if(a[i] == a[i+1])
				cnt++;
		}
		return cnt;
	}
	
	public static int[] remove(int[] a,int cnt)
	{
		int s = 0;
		int[] b = new int[a.length-cnt];
		b[0] = a[0];
		for(int i = 0; i < a.length - 1 ;i++)
		{
			if(a[i] == a[i+1])
				s++;
			else
				b[i-s+1] = a[i+1];
		}
		return b;
	}
}

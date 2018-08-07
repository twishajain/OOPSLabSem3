class Factorial
{
	public static void main(String args[])
	{
		int m,n,i,j;
		n=1;
		m=Integer.parseInt(args[0]);
		for(i=1;i<m+1;i++)
		{
			n=n*i;
		}
		System.out.println(n);
	}
}

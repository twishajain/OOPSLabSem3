public class tennumbers{
	public static void main(String a[])
	{
		int sum0=0,sum2=0,sum3=0;
		for (int i=0;i<10;i++)
		{
			int q=Integer.parseInt(a[i]);
			if (q==0)
				{sum0++;}
			else if (q>0)
				sum2++;
			else
				sum3++;
		}
		System.out.println(sum0);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}

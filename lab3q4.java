import java.util.Scanner;
class lab3q4
{
        public static void main(String args[])
        {
                Scanner s1=new Scanner(System.in);
                int m,n,i,j,t=0;
System.out.println(" Enter n and m:");
                m=s1.nextInt();
                n=s1.nextInt();
                for(i=m;i<n+1;i++)
                {
                        t=0;
                        for (j=2;j<i;j++)
                        {
                                if (i%j==0)
                                        t=1;
                        }
                if (t==0&&i!=1)
                        System.out.print(i+" ");
                }

        }
}

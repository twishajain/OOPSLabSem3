import java.util.Scanner;
public class lab4q1 
{
    public static void main(String args[])
    {
        int i=0,j=0,sum=0;
        Scanner s1=new Scanner(System.in);//creating scanner object
        System.out.println("Enter the number of rows:");
        int n=s1.nextInt();
        System.out.println("Enter the number of columns:");
        int m=s1.nextInt();
        int a[][]=new int[n][m];
        if (n!=m)//checking for square matrix
            System.out.println("not a square matrix");
        else
        {
            System.out.println("Enter elements:");
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<m;y++)
                    a[x][y]=s1.nextInt();
            }
            for (i=0;i<n;i++)
            {
                System.out.println(a[i][n-i-1]);//nonprincipal elements
                sum=sum+a[i][n-i-1];
            }
            System.out.println("Sum"+sum);
        }
    }
}

import java.util.Scanner;
public class lab4q5 
{
    public static void main(String[] args)
    {
        int i,j,flag=0,sum=0,sum1=0;
       
        Scanner s1=new Scanner(System.in);//creating scanner object
        System.out.println("Enter the number of rows:");
        int n=s1.nextInt();
        System.out.println("Enter the number of columns:");
        int m=s1.nextInt();
         int a[][]=new int[n][m];
        if (n!=m)
            {System.out.println("Matrix is not a square");flag=1;}
        else
        {
            for (i=0;i<n;i++)//initialising matrix
                {
                    for (j=0;j<n;j++)
                        {a[i][j]=s1.nextInt();}
                }
            for (j=0;j<n;j++)
            {
                sum=sum+a[0][j];//sum of row1
            }
            for (i=1;i<n;i++)//sum of rows
            {
                for (j=0;j<n;j++)
                {
                    sum1=sum1+a[i][j];
                }
                if (sum1!=sum)
                {
                    flag=1;
                    break;
                }
                sum1=0;
            }
            for (j=0;j<n;j++)//sum of columns
            {
                for (i=0;i<n;i++)
                {
                    sum1=sum1+a[i][j];
                }
                if (sum1!=sum)
                {
                    flag=1;
                    break;
                }
                sum1=0;
            }
            sum1=0;
            for (i=0;i<n;i++)//principal diagonal
            {
                    sum1=sum1+a[i][i];
            }
            if (sum1!=sum)
                flag=1;
            sum1=0;
            for (i=0;i<n;i++)
            {
                sum1=sum1+a[i][n-i-1];
            }
            if (sum1!=sum)
                flag=1;
            if (flag==0)
                System.out.println("Magic square");
            else
            System.out.println("Not a Magic square");

        }
    }
}


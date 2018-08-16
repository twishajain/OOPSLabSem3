import java.util.Scanner;
public class lab4q4 {
    public static void main(String[] args)
    {
        int i,j,flag=0;
       
        Scanner s1=new Scanner(System.in);//creating scanner object
        System.out.println("Enter the number of rows of matrix1:");
        int n=s1.nextInt();
        System.out.println("Enter the number of columns of matrix1:");
        int m=s1.nextInt();
        int a[][]=new int[n][m];
         System.out.println("Enter the number of rows of matrix2:");
        int c=s1.nextInt();
        System.out.println("Enter the number of columns of matrix2:");
        int d=s1.nextInt();
        int b[][]=new int[c][d];
        int t[][]=new int[c][d];
        if (c!=n || d!=m)//check to see n*m
            System.out.println("Matrix entered have different no of rows/cols");
        else
        {
            System.out.println("Enter the elements of matrix1:");
            for (i=0;i<n;i++)//initialising matrix
            {
                for (j=0;j<m;j++)
                    {a[i][j]=s1.nextInt();}
            }
            System.out.println("Enter the elements of matrix2:");
            for (i=0;i<n;i++)//initialising matrix
            {
                for (j=0;j<m;j++)
                    {b[i][j]=s1.nextInt();}
            }
            for (i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    t[i][j]=a[i][j]+b[i][j];//adding
                }
            }
            System.out.println("Addition of matrices entered:");
            for (i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(t[i][j]+"    ");
                }
                System.out.println("");
            }
            
        }
        int q[][]=new int[n][d];
        int prod=0;
        if (m==c)//if cols of first=rows of second
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<d;j++)
                    q[i][j]=0;
            } 
            for(i=0;i<n;i++)
            {
                for( j=0;j<d;j++)
                {
                    for(int k=0;k<c;k++)
                    {
                        prod=prod+a[i][k]*b[k][j];//multiplying
                    }
                    q[i][j]=prod;
                    prod=0;
                }
            }
            System.out.println("Product of matrices");

            for(i=0;i<n;i++)
            {
                for(j=0;j<d;j++)
                    System.out.print(q[i][j]+"   ");
                System.out.println();
            }
        }
        else
            System.out.println("Matrix multiplication not possible");
    }
}

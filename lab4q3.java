import java.util.Scanner;
public class lab4q3 {
    public static void main(String[] args)
    {
        int i,j,flag=0;
       
        Scanner s1=new Scanner(System.in);//creating scanner object
        System.out.println("Enter the number of rows:");
        int n=s1.nextInt();
        System.out.println("Enter the number of columns:");
        int m=s1.nextInt();
         int a[][]=new int[n][m];
        if (n!=m)
            System.out.println("Matrix is not symmetric as it isnt square");
        else//transpose checking if square matrix
        {
            System.out.println("Enter elements:");
            for (i=0;i<n;i++)//initialising matrix
            {
                for (j=0;j<n;j++)
                    {a[i][j]=s1.nextInt();}
            }
            for (i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if (a[i][j]!=a[j][i])//checking for symmetric 
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if (flag==1)
                System.out.println("Not a symmetric matrix");
            else
                System.out.println("Symmetric matrix");
        }
    }}

import java.util.Scanner;
public class lab4q2 {
    public static void main(String args[])
    {
        int i=0,j=0,flag=0;
        Scanner s1=new Scanner(System.in);//creating scanner object
        System.out.println("Enter the number of rows:");
        int n=s1.nextInt();
        System.out.println("Enter the number of columns:");
        int m=s1.nextInt();
        int a[][]=new int[n][m];
        int h;
        if (n<m)//checking for smaller num btw n and m
            h=n;
        else
            h=m;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<m;y++)
                a[x][y]=s1.nextInt();//taking input
        }
       System.out.println("Principal diagonal elements:");
        do{
            System.out.print(a[i][i]+ "  ");
            flag=flag+a[i][i];
            i++;//going down and right
        } while (i<h);
        System.out.println("sum:"+flag);
    }
}

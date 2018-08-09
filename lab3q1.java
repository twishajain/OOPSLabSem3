import java.util.Scanner;
import java.lang.Math;
public class lab3q1 {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();//taking input
        int count=0,i=n,m=n;
        double sum=0;
        while(n!=0)//finding length of number
        {
            i=n%10;
            count++;
            n=n/10;
        }
        n=m;
        while(n!=0)
        {
            i=n%10;
            double d=i;
            double s=count;
            double v=Math.pow(d,s);//calculating sum of powers of digits
            sum=sum+v;
            n=n/10;
        }
        if(sum==m)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
}

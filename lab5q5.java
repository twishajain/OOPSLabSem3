import java.util.Scanner;

class Number
{
    private double x;
    Number()
    {
        x=0;
    }
    Number(double a)
    {
        x=a;
    }
    boolean isZero()
    {
        if (x==0)
            return true;
        else
            return false;
    }
    boolean isPositive()
    {
        if (x>=0)
            return true;
        else
            return false;
    }
    boolean isNegative()
    {
        if (x<0)
            return true;
        else
            return false;
    }
    boolean isOdd()
    {
        if (x%2!=0)
            return true;
        else
            return false;
    }
    boolean isEven()
    {
        if (x%2==0)
            return true;
        else
            return false;
    }
    boolean isPrime()
    {
     
        int flag=0;
        for (int i=2;i<x/2;i++)
        {
            if (x%i==0)
                flag=1;
        }
        if (flag==0)
            return true;
        else
            return false;
    }
    boolean isArmstrong()
    {
        int n=(int)x;
        double sum=0;
        int count=0;double i;
        while(n!=0)//finding length of number
        {
            i=n%10;
            count=count+1;
            n=n/10;
        }
        n=(int)x;
        while(n!=0)
        {
            i=n%10;
            double d=i;
            double s=count;
        
            double v=java.lang.Math.pow(d,s);//calculating sum of powers of digits

            sum=sum+(v);
            n=n/10;
        }
        
        if(sum==x)
            return true;
        else
            return false;
    }
}


public class lab5q5 {
    public static void main(String args[]){
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter no:");
    double c=s1.nextDouble();
    Number num=new Number(c);
    System.out.println("isZero"+num.isZero());
    System.out.println("isPositive"+num.isPositive());
    System.out.println("isNegative"+num.isNegative());
    System.out.println("isOdd"+num.isOdd());
    System.out.println("isEven"+num.isEven());
    System.out.println("isPrime"+num.isPrime());
    System.out.println("isArmstrong"+num.isArmstrong());
}
}

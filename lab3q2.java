import java.util.Scanner;
class lab3q2
{
        public static void main(String args[])
        {
                Scanner s1=new Scanner(System.in);
                int m,n,i,j,a,b;
System.out.println("Enter length and width:");
                m=s1.nextInt();             
                n=s1.nextInt();             
                i=n*m;
                a=n+m;
                j=2*a;
                System.out.println("Area="+i);
                System.out.println("Perimeter="+j);

        }
}

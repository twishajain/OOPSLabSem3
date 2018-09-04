import java.util.Scanner;
class lab3q5{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter no to be searched");
int n=s1.nextInt();
int a[]={1,2,3,1,2,1,5,6,7};
int count=0;
for (int i:a)
{if (i==n)

System.out.println("a["+count+"]"+"  ");
count++;
}
}
}

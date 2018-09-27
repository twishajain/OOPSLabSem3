import java.util.Scanner;
class A
{
    static int count=0;
    A()
    {
        count++;
    }
    void printin()
    {
        System.out.println(count-1);
    }
}
public class lab7q2 {
    public static void main(String args[]){
    char ch='y';
   System.out.println("Do you want to create object y/n");
    Scanner s=new Scanner(System.in);
    ch=s.next().charAt(0);
    while(ch=='y')
    {
       
        A p=new A();
        System.out.println("Do you want to create object y/n");
        ch=s.next().charAt(0);
    }
    A g=new A();
    g.printin();
    }
}

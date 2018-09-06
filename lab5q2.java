import java.util.Scanner;
class employe{
    String name;
    String city;
    double sal;
    double da;
    double hra;
    void getdata()
    {
        System.out.println("Enter emp name:");
        Scanner s1=new Scanner (System.in);
        name=s1.next();
        System.out.println("Enter city :");
        city=s1.next();
        System.out.println("Enter basic salary");
        sal=s1.nextDouble();
        System.out.println("Enter dearness allowance:");
        da=s1.nextDouble();
        System.out.println("Enter HRA:");
        hra=s1.nextDouble();
                        
    }
    double calculate()
    {
        return (sal+(sal*(da/100))+(sal*(hra/100)));
    }
    void disp(double total)
    {
        System.out.println("total:"+  total);
    }
}
public class lab5q2 {
    public static void main(String args[])
    {
        employe e=new employe();
        e.getdata();
        double s=    e.calculate();
        e.disp(s);
    }
    
}

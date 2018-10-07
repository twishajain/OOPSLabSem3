import java.util.Scanner;
interface a
{
void totalSales();              //func in interface
}
class Hardware implements a{
int category,m1,m2,m3;String manu;
Hardware()
{
m1=1;m2=2;m3=3;
category=2;             //constructor declaration
manu="ABC";
}
public void totalSales()
{
        System.out.println("Total:"+(m1+m2+m3));    //method of interface must be public in class
}
}
class Software implements a{
String type;String os;int m1,m2,m3;
Software()
{
type="ABCD";
os="Unix";
m1=0;m2=1;m3=2;
}
public void totalSales()
{
        System.out.println("total:"+(m1+m2+m3));
}
}
class lab8q1{
public static void main(String args[])
{
Hardware a=new Hardware();
a.totalSales();
Software b=new Software();
b.totalSales();
}
}

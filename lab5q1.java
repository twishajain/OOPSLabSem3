import java.util.Scanner;
class box{
    double w;
    double h;
    double d;
    box(){
        w=1;
        h=1;
        d=1;
    }
    box(double a,double b,double c)
    {
        w=a;
        h=b;
        d=c;
    }
    double volume()
    {
        return (w*h*d);
    }
}
class lab5q1 {
    public static void main(String args[]){
    System.out.println("Enter width,height,depth of box");
    Scanner s1=new Scanner(System.in);
    double a,b,c;
    a=s1.nextDouble();
    b=s1.nextDouble();
    c=s1.nextDouble();
    box v=new box(a,b,c);
    System.out.println("Volume is "+v.volume());
}}

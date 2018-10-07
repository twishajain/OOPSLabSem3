abstract class Area{
abstract void calc();   //abstract class
}
class Circle extends Area{int r;
Circle()
{r=1;}
void calc()
{

System.out.println((3.14)*r*r);   //calc area of circle
}
}
class Rectangle extends Area{int l,b;Rectangle(){l=1;b=2;}
void calc()
{
System.out.println(l*b);    //calc area of rectangle
}
}
class lab8q2{
public static void main(String args[])
{
Circle c=new Circle();
c.calc();
Rectangle r=new Rectangle();
r.calc();
}
}

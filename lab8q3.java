interface a
{
void area();    //interface created
}
class Circle implements a{int r;
Circle(){r=1;}
public void area()
{
System.out.println((3.14)*r*r);   //area of circle
}}
class Rectangle implements a{int l,b;
Rectangle()
{
l=2;
b=3;
}
public void area()
{
System.out.println(l*b);      //area of rectangle
}}
class lab8q3{
public static void main(String args[])
{
Circle c=new Circle();
c.area();
Rectangle r=new Rectangle();
r.area();
}
}

interface a
{
void area();      //interface created
}
class Circle implements a{
public void area()
{
System.out.println((3.14)*1*1); //calc are of circle
}}
class Rectangle implements a{
public void area()
{
System.out.println(2*       //calc area of rectangle
3);
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

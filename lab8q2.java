abstract class Area{
abstract void calc();
}
class Circle extends Area{
void calc()
{

System.out.println((3.14)*1*1);
}
}
class Rectangle extends Area{
void calc()
{
System.out.println(1*2);
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

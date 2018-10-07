class Student_Detail{
final String college="MIT";   //college name is constant
String name;
int id;
Student_Detail()
{
name="ABC";
id=0;
}
Student_Detail(int a,String b)
{
id=a;
name=b;
}
void disp()
{
System.out.println("College:"+college+"id:"+id+"name:"+name);     //displaying details func
}
}
class lab7q1{
public static void main(String args[])
{
Student_Detail s=new Student_Detail();
s.disp();                               //object creation ie students 
Student_Detail t=new Student_Detail(1,"Twisha");
t.disp();
}}

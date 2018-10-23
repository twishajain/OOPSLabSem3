import java.util.Scanner;
class lab10q9{
public static void main(String args[])
{Scanner s1=new Scanner(System.in);
String name; int rollno,m1,m2,m3;
try{
System.out.println("Enter name,rollno and marks in 3 subjects");
name=s1.next();
rollno=Integer.parseInt(s1.next());     //input rollno and marks in string convert to int
m1=Integer.parseInt(s1.next());
m2=Integer.parseInt(s1.next());
m3=Integer.parseInt(s1.next());
double percentage=(m1+m2+m3)/3;
char grade;
if (percentage>=50)grade='A';           //give grades
else grade='B';
System.out.println(percentage+""+grade);
}
catch(NumberFormatException e)                  //if no entered not in int form error caught
{
System.out.println("Error");
}
finally{
System.out.println("Done");
}
}}

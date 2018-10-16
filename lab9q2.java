import java.util.Scanner;
class lab9q2{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
String str1=s1.next();
String str2=s1.next();
String s3=str1;
for (int i=0;i<s1.length();i++)
{
int count=0;
for (int j=0;j<s1.length();j++)
{
if (str1.charAt(i)==str1.charAt(j))
count++;
}
if (count>1)
{
s3=s3.replace(String.valueOf(str1.charAt(i)),str2);
}
}
}
System.out.println(s3);

}}

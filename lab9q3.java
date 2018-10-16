import java.util.Arrays;
import java.util.Scanner;
class lab9q3
{
    public static void main(String args[])
    {
System.out.println("1.Check pallindrome 2.alphabetical order 3.reversing 4.concatentingrev+str");
int option ;

        Scanner s1=new Scanner(System.in);
option=s1.nextInt();
switch (option){case 1:
System.out.println("Enter string");
        String str1=s1.next();
        StringBuffer str2=new StringBuffer(str1);
        str2.reverse();
        if (str1.equals(str2.toString()))
        System.out.println("Pallindrome");
else
System.out.println("Not pallindrome");
break;
case 2:
System.out.println("Enter string");
String l=s1.next();
char chararr[]=new char[l.length()];
chararr=l.toCharArray();
Arrays.sort(chararr);
String h=new String(chararr);
System.out.println(h);
break;
case 3:
System.out.println("Enter string");
StringBuffer s=new StringBuffer();
String a=s1.next();
s.append(a);
s.reverse();
System.out.println(s);
break;
case 4:
System.out.println("Enter string");
StringBuffer f=new StringBuffer();
String b=s1.next();
f.append(b);
f.reverse();
System.out.println(b+f);

    }}}

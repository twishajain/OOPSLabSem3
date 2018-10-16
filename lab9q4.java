import java.util.Scanner;

class lab9q4
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
char ch='y';int option;
System.out.println("1.String comparison 2.UppertoLower.. 3.substringOrNot");
do{
option=s1.nextInt();
switch(option)
{
case 1: String str1=s1.next();    //to compare 2 strings
String str2=s1.next();
System.out.println(str1.compareTo(str2));
break;
case 2:String str3=s1.next();String str4="";    //to convert case
for (int i=0;i<str3.length();i++)
{
char t=str3.charAt(i);char p=str3.charAt(i);
if (t>='a' && t<='z')
        t=(char)(t-32);
else if (t>='A' && t<='Z')
        t=(char)(t+32);
str4=str4+t;;
}
System.out.println(str4);
break;
case 3:   //to check ifsubstring and replace with the word "Hello"
String str5=s1.next();
String str6=s1.next();
int g=str5.indexOf(str6);
if (g==-1)
System.out.println("Substring not found");
else
{System.out.println("Susbtring found at"+g);str5=str5.replace(str6,"Hello");
System.out.println(str5);}
break;

}System.out.println("Do you wanna continue");
ch=s1.next().charAt(0);
}
while(ch=='y');
}
}

import static java.lang.System.*;
public class pallindrome{
public static void main(String a[]){
int q,i;
q=a[0].length();
int flag=0;
String s=a[0];

for (i=0;i<q/2;i++)
{
if (s.charAt(i)!=s.charAt(q-i-1))
{flag=1;
break;}}
if (flag==1)
System.out.println("Not a pallindrome");
else
System.out.println("Pallindrome");
}}

import java.util.Scanner;
class NegException extends Exception{           //exception if no is negative
public String toString()
{return "Error found";}}
class lab10q10{
public static void main(String args[]) throws NegException
{Scanner s1=new Scanner(System.in);
try{
System.out.println("Enter positive integer");
int x=s1.nextInt();
if (x<0)throw new NegException();               //throw user defined exception
else
System.out.println(x);
}
catch(NegException e)
{System.out.println(e);}                //print toString method of exception
}}

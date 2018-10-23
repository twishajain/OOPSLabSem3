import java.util.Scanner;
import java.lang.Math.*;
class NegException extends Exception{           //exception if no is negative
public String toString()
{return "Negative Number Exception Found";}}
class lab10q12{
public static void main(String args[]) throws NegException
{Scanner s1=new Scanner(System.in);
try{
System.out.println("Enter integer whose root you want to find");
int x=s1.nextInt();
if (x<0)throw new NegException();               //throw user defined exception
else
System.out.println(Math.sqrt(x));
}
catch(NegException e)
{System.out.println(e);}                //print toString method of exception
}}

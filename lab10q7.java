import java.util.Scanner;
class lab10q7{
public static void main(String args[]){
Scanner s1=new Scanner(System.in);
System.out.println("Enter a no");
String x;
x=s1.next();    //input a string
try{
System.out.println((Integer.parseInt(x)+1));}           //adding one to a no.
catch(NumberFormatException e){System.out.println("Error");}    //if string is not in int format
finally{System.out.println("done");}
}
}

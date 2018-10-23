import java.util.Scanner;
class lab10q8{
public static void main(String args[])
{
System.out.println("{'a','b','c'}");
System.out.println("Which index of arr do you wish to display");
 Scanner s1=new Scanner(System.in);
char arr[]={'a','b','c'};
int h;
h=s1.nextInt();         //entering index to be printed
try{
System.out.println(arr[h]);             //printing value if valid index
System.out.println("Success");} 
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Error");            //exception raised
}
finally{System.out.println("Done");}
}
}

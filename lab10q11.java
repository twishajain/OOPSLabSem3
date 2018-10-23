import java.util.Scanner;
class NotSquareException extends Exception{
public String toString()
{               //user defined exception if not square matrix
return "Error101 Not a square matrix";}
}
class lab10q11{
public static void main(String args[]) throws NotSquareException        //func that throws user defined exception
{Scanner s1=new Scanner(System.in);
int m,n;
try{
System.out.println("Enter no of rows and cols");
m=s1.nextInt();
n=s1.nextInt();
if (n!=m)
throw new NotSquareException();         //checking for square matrix
else
System.out.println("Verified square matrix");
}catch(NotSquareException e)
{
System.out.println(e);
}
}
}

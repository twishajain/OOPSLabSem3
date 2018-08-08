import java.util.Scanner;
public class LargeSmall
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter !st No: ");
        a = scan.nextInt();
        System.out.println("Enter 2nd No: ");
        b = scan.nextInt();
        System.out.println("Enter 3rd No: ");
        c = scan.nextInt();
        
        int maxVal = a>b?(a>c?a:c):(b>c?b:c);
        int minVal = c < (a < b ? a:b) ? c:(a < b ? a:b);

        System.out.println("Largest Number: "+maxVal);
        System.out.println("Smallest Number: "+minVal);

        

        
    }
}

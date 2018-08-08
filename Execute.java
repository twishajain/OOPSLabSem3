import java.util.Scanner;
public class Execute
{
    public static void main(String args[])
    {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        a = scan.nextInt();
        System.out.println("Enter B: ");
        b = scan.nextInt();
        System.out.println("Part a: ");
        int outa = (a<<2)+(b>>2);
        System.out.println("OUTPUT: "+outa);
        System.out.println("Part b: ");
        boolean outb = b>0;
        System.out.println("OUTPUT: "+outb);
        System.out.println("Part c: ");
        int outc = (a+b*100)/10;
        System.out.println("OUTPUT: "+outc);
        System.out.println("Part d: ");
        int outd = a&b;
        System.out.println("OUTPUT: "+outd);


        
    }
}

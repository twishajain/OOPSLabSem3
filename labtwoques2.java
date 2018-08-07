/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class labtwoques2 {
    public static void main(String[] args)
    {
       Scanner s1= new Scanner(System.in);
       System.out.println("Enter integer");
       int i=s1.nextInt();
       System.out.println("Enter double");
       double d=s1.nextDouble();
       System.out.println("Enter char");
       char c=s1.next().charAt(0);
       byte b=(byte) i;
       byte g=(byte) d;
       int n=c;
       System.out.println("Int to byte"+b);
       System.out.println("Char to int"+n);
       System.out.println("Double to byte"+g);
       int k=(int) d;
       System.out.println("double to int"+k);
       
       
       
       
    }
}

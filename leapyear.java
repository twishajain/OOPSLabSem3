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
public class leapyear {
    public static void main(String[] args)
    {
        int h,f=0;
        Scanner s1=new Scanner(System.in);
        h=s1.nextInt();
        if (h%4!=0)
            f=1;
        else
        {
            if (h%100!=0)
                f=0;
            else 
            {
                if (h%400!=0)
                    f=1;
                else
                    f=0;
            }
        }
        if (f==0)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
    
}

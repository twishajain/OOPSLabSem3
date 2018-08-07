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
public class lab2q5{
    public static void main(String[] args)
    {
        char d;
        do{
        System.out.println("Enter a number");
        Scanner s1=new Scanner(System.in);
        float a=s1.nextFloat();
        System.out.println("Enter an operator");
        char o=s1.next().charAt(0);
        System.out.println("Enter a number");
        int b=s1.nextInt();
        
        
        switch (o){
            case'+':
                System.out.println(a+b);
                System.out.println("again?(y or n)");
                d=s1.next().charAt(0);
                break;
            case '-':
                System.out.println(a-b);
                System.out.println("again?(y or n)");
                d=s1.next().charAt(0);
                break;
            case '*':
                System.out.println(a*b);
                System.out.println("again? (y or n)");
                d=s1.next().charAt(0);
                break;
            case '/':
                System.out.println(a/b);
                System.out.println("again? (y or n)");
                d=s1.next().charAt(0);
                break;
            default:
                System.out.println("error");
                System.out.println("again? (y or n)");
                d=s1.next().charAt(0);
        }
        }
        while (d=='y');
        }
    }
    


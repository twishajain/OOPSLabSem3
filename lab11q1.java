import java.util.Scanner;

class NewThread1 implements Runnable{
    
    Thread t;
    NewThread1(){
    t = new Thread (this,"Demo thread");
    System.out.println("Child Thread:" + t);
    t.start();}
    
    //Entry point for second thread
    
    public void run(){
        
        try {
            
            for (int i=5;i>0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
            
        }
        catch (InterruptedException e){
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting Child Thread");
        
    }
    
}

class NewThread2 extends Thread{
    
    NewThread2(){
        
        super("demo thread");
         System.out.println("Child Thread:" + this);
         start();
        
    }
 public void run(){
        
        try {
            
            for (int i=5;i>0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
            
        }
        catch (InterruptedException e){
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting Child Thread");
        
    }
    
}


public class lab11q1 {
    
    public static void main (String args[]){
        
        int choice=0;
        Scanner sc = new Scanner (System.in);
        
    
        while (choice!=3){
            System.out.println("1. Implement 2. Extend 3. Quit");
        
        choice = sc.nextInt();
            switch (choice){
                
                case 1 : {
                    
                    new NewThread1();
                break;}
                case 2 : {
                    
                    new NewThread2();
                 break;
                    
                }
                case 3 : break;
                
                default : {
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        
    }
    
    
}

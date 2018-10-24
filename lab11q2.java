import java.util.Scanner;

class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String s){
        name = s;
    t = new Thread (this,s);
    System.out.println("New Thread:" + t);
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

public class lab11q2 {
    
    public static void main (String args[]){
        
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");
        try {
            //wait for other threads to end
            Thread.sleep(10000);
            
            
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
        
    }
    
    
}

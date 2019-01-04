import java.io.*;
import java.util.Scanner;
class Student implements Serializable
{
    int regno,blockno,roomno;
    Student(int a,int b,int c)
    {
        regno=a; blockno=b; roomno=c;
        
    }
}

class Student2 implements Serializable
{
    int regno,sem; float cgpa;
    Student2(int a,int b,float c)
    {
        regno=a; sem=b;cgpa=c;
        
    }
}


public class test {
    public static void main(String args[])
    {
        try{
            FileOutputStream f1=new FileOutputStream("test.txt");
        ObjectOutputStream d=new ObjectOutputStream(f1);
        Scanner s1=new Scanner(System.in);
        for (int i=0;i<3;i++){

        System.out.println("Enter regno, blockno, roomno all of type int");
        Student s=new Student(s1.nextInt(),s1.nextInt(),s1.nextInt());
        d.writeObject(s);
            }
        d.close();
        }
        catch(Exception e)
        {
            System.out.println("eeee");
        }
        System.out.println("Written");
        try {
                        FileOutputStream f1=new FileOutputStream("testt.txt");
        ObjectOutputStream d=new ObjectOutputStream(f1);
        Scanner s1=new Scanner(System.in);
        for (int i=0;i<3;i++){

        System.out.println("Enter regno, sem, cgpa");
        Student2 ss=new Student2(s1.nextInt(),s1.nextInt(),s1.nextFloat());
        d.writeObject(ss);
            }
        d.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
        try
        {
            ObjectInputStream oo=new ObjectInputStream(new FileInputStream("testt.txt"));
            
           
            for (int i=0;i<3;i++)
            
            {
                ObjectInputStream ooo=new ObjectInputStream(new FileInputStream("test.txt"));
                Student2 g= (Student2)oo.readObject();
                
               if (g.sem==4)
               {
               

                for (int j=0;j<3;j++)
            {
               Student gg= (Student)ooo.readObject();
               if (g.regno==gg.regno)
                   System.out.println("Room no:"+gg.roomno);
            }
            }
            }       }
        catch(Exception e)
        {
            System.out.println(e);
        }
try{
        System.out.println("Enter reg no");
        
        Scanner s2=new Scanner(System.in);
        int reg=s2.nextInt();
        System.out.println("Enter new roomno");
        int room=s2.nextInt();
        ObjectOutputStream v=new ObjectOutputStream(new FileOutputStream("hello.txt"));
        ObjectInputStream b=new ObjectInputStream(new FileInputStream("test.txt"));
        for (int i=0;i<3;i++)
        {
            Student p=(Student) b.readObject();
            if (p.regno!=reg)
                v.writeObject(p);
            else
            {
                p.roomno=room;
                v.writeObject(p);
            }
            
        }
            System.out.println("New");
            ObjectInputStream a=new ObjectInputStream(new FileInputStream("hello.txt"));
            for (int i=0;i<3;i++)
            {
                Student q=(Student)a.readObject();
                System.out.println(q.blockno+""+q.roomno);
            }
                }
catch(Exception e)
{
    System.out.println(e);
}
        
        }
    }
    

       
        

class Student{
    int regno;
    String name;
    int age;
    Student()
    {
        System.out.println("Student initialised");
        regno=000000;
        name="ABC";
        age=19;
    }
    Student(int a,String b,int c)
    {
                System.out.println("Student initialised");

        regno=a;
        name=b;
        age=c;
    }
    void print()
    {
        System.out.println("In class student");
    }
    
}
class UG extends Student{
    int sem;
    int fees;
    UG()
    {
        super();
        sem=3;
        fees=210000;
                System.out.println("UG initialised");

    }
    UG(int a,int b,int c,String d,int e)
    {
        super(c,d,e);
        sem=a;
        fees=b;
                System.out.println("UG initialised");

    }
    void print()
    {
                System.out.println("In class UG");

    }
    void printagain()
    {
        
    }
    
}
class PG extends Student{
    int sem;
    int fees;
     PG()
    {
        super();
        sem=3;
        fees=210000;
                System.out.println("PG initialised");

    }
    PG(int a,int b,int c,String d,int e)        //overloaded constructors
    {
        super(c,d,e);
        sem=a;
        fees=b;
                System.out.println("PG initialised");

    }
    void print()        //overridden methods
    {
                System.out.println("In class PG");

    }
}


public class lab6q2 {
    public static void main(String args[])
    {
        Student a=new Student();
        a.print();      
        UG b=new UG(3,20000,17089154,"DFG",20);
        b.print();      //print method of subclass
        Student aref;
        aref=b;        //superclass ref created
        aref.print();
        PG c=new PG();
        c.print();
        
    }
    
}

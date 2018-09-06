
    class complex{
        int real;
        int img;
        complex(int a,int b)
        {
            real=a;
            img=b;
        }
        complex add(int a,complex b)
        {
           complex c=new complex(a+b.real,b.img);
           return c;
        }
        complex add(complex a,complex b)
        {
            complex d=new complex(a.real+b.real,a.img+b.img);
            return d;
        }
        void disp()
        {
            System.out.println(real+"+"+img+"i");
        }
    }
public class lab5q4
{
    public static void main(String args[])
    {
        complex a=new complex(1,3);
        complex b=new complex(5,7);
        a.disp();
        b.disp();
        complex c=new complex(0,0);
        c=a.add(a,b);
        c.disp();
        System.out.println("5");
        int k=5;
        c=a.add(k,a);
        c.disp();
    }
}

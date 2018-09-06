class timer
{
    int hrs;
    int mins;
    int secs;
    timer()
    {
        hrs=0;
        mins=0;
        secs=0;
    }
    timer(int a,int b,int c)
    {
        hrs=a;
        mins=b;
        secs=c;
    }
    void disp()
    {
        System.out.println(hrs+":"+mins+":"+secs);
    }
    timer addition(timer a,timer b)
    {
        timer c=new timer();
        int temp=0;
        c.secs=a.secs+b.secs;
        if (c.secs>=60)//ensuring secs doesnt exceed 60
        {
            temp=(c.secs/60);
            c.secs=(c.secs%60);
        }
        c.mins=a.mins+b.mins+temp;//calculating mins
        if (c.mins>=60)
        {
            temp=c.mins/60;
            c.mins=c.mins%60;
        }
        c.hrs=a.hrs+b.hrs+temp;//calculating hrs
        if (c.hrs>12)
            c.hrs=c.hrs%12;
        return c;
    }
}
public class lab5q3 {
    public static void main(String args[])
    {
    timer t1=new timer(03,03,03);
    timer t2=new timer(13,57,60);
    t1.disp();
    t2.disp();
    timer t3=t1.addition(t1, t2);
    t3.disp();
    
}
}

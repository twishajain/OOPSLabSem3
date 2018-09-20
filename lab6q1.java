class Account{
    String name;
    double acctno,balance;
    char type;
    Account()
    {
        name=null;
        acctno=0;
        type='c';
        balance=0;
    }
    Account(String a,double b,char d)
    {
        name=a;
        acctno=b;
        type=d;
        balance=0;
    }
    void disp()
    {
        System.out.println( balance);
    }
    double deposit(double a)
    {
        balance=balance+a;
        return balance;
    }
    double withdraw(double a)
    {
        balance=balance-a;
        return balance;
    }
}
class Savings extends Account{
    double cent;
    Savings()
    {
        super();
        type='s';
        cent=0.01;
    }
    Savings(double x,String a,int b)
    {
        super(a,b,'s');
        cent=x;
    }
    void interest()
    {
        double interest=balance*cent;
        System.out.println("Interest:"+interest);
        deposit(interest);
    }
    
    
}
class Current extends Account{
    Current()
    {
        super();
        
    }
    Current(String a,int b)
    {
        super(a,b,'c');
    }
    void interest()
    {
        System.out.println("No interest on current accounts");
}
    void check()
    {
        if (balance<2500)
        {
            System.out.println("Penalty of 1000 imposed");
            withdraw(1000);
        }
        else
           System.out.println("Minm balance maintained");
    }
} 




public class lab6q1 {
    public static void main(String args[]){
    Account hb=new Account();
    hb.deposit(1000);
    Savings s=new Savings(0.1,"Twisha",12);
    s.deposit(2000);
    s.interest();
    s.disp();
    s.withdraw(500);
    s.disp();
    Current c=new Current("ABC",13);
    c.deposit(1000);
    c.check();
    c.disp();
    
    }
}

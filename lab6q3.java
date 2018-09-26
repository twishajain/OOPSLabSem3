class Bank
{
int r;
Bank()
{
r=6;
}
int getRateOfInterest()
{
return r;
}
}
class SBI extends Bank{
SBI()
{
r=8;
}
int getRateOfInterest() //super class func overridden
{
return r;}
}
class ICICI extends Bank
{
ICICI()
{
r=7;
}
int getRateOfInterest()
{
return r;}
}
class AXIS extends Bank
{
AXIS()
{
r=9;}
int getRateOfInterest()
{
return r;
}
}
class lab6q3{
public static void main(String args[])
{
	Bank b=new Bank();
	System.out.println(b.getRateOfInterest()); 
	SBI s=new SBI();
	System.out.println(s.getRateOfInterest()); //calling overridden method
	Bank bref; //reference variable
	bref=b;
	System.out.println(bref.getRateOfInterest());   //dynamic method dispatch
	bref=s;
	System.out.println(bref.getRateOfInterest());
}
}


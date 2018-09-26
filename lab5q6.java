import java.util.Scanner;
class Book
{
	String title,author;
int edition;
Book(String t,String a,int e)
{
title=t;
author=a;
edition=e;
}
void Display()
{
if(author.equals("Harry"))
{
System.out.print(title);
System.out.print(author);
System.out.print(edition);
}}}
public class lab5q6
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
Book b[]=new Book[6];
String z,x;
int c;
for(int i=0;i<6;i++)
{
System.out.println("Book Name:");
z=s1.next();
System.out.print("Author Name");
x=s1.next();
System.out.print("Edition:");
c=s1.nextInt();
b[i]=new Book(z,x,c);
}
for(int j=0;j<6;j++)
b[j].Display();
}}

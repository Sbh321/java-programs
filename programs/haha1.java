import java.util.Scanner;

class A extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
    {
      System.out.println("SUM is: ");
    }
  }
}

class B extends Thread
{
  public void run()
  {
    for(int j=0;j<5;j++)
    {
      System.out.println("SUB is: ");
    }
  }
}
class C extends Thread
{
  public void run()
  {
    for(int k=0;k<5;k++)
    {
      System.out.println("MUL is: ");
    }
  }
}

public class haha1
{
  public static void main(String[] args) 
  {
    A a1=new A();
    B b1=new B();
    C c1=new C();
    // int a,b;
    // Scanner s=new Scanner(System.in);
    // System.out.println("Enter the value of a and b");
    // a=s.nextInt();
    // b=s.nextInt();

    a1.start();
    b1.start();
    c1.start();

  }
}

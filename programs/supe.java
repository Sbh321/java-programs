class A
{
  int i;
  int j;
  void prnt()
  {
    System.out.println("Sum is: "+(i+j));
  }
}

class B extends A
{
  super.i=1;
  super.j=2;
}

public class supe 
{
  public static void main(String[] args) 
  {
    A a1=new A();
    a1.prnt();
  }
}

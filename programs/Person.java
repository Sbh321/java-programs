//Demonstrate the use of this keyboard

public class Person
{
  int a,b;

  void set(int a, int b)
  {
    this.a = a;
    this.b = b;
  }

  public void display()
  {
    int c = a + b;
    System.out.println("Sum is: "+c);
  }

  public static void main(String[] args) 
  {
    Person a1 = new Person();
    a1.set(1,2);
    a1.display();
  }
}
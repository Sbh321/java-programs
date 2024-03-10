public class recursion1
{
  static int fact(int a)
  {
    if (a == 1)
      return 1;
    else 
      return a*fact(a-1);
  }
  public static void main(String[] args) 
  {
    System.out.println("fact is: "+fact(5));
  }
}
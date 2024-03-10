class A extends Thread
{
  int total=0;
  public void run()
  {
    synchronized(this)
    {
      for (int i=1;i<10;i++)
      {
        total=total+1;
      }
      this.notify();;//open block
    }
  }
}


public class MultiThread1 
{
  public static void main(String[] args) throws InterruptedException 
  {
    A a1= new A();
    a1.start();
    synchronized(a1)
    {
      a1.wait();
      System.out.println("Value: "+a1.total);
    }
  }
}

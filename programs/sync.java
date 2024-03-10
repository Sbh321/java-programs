class bookticket
{
  int totalnoofseats=10;
  void book1(int seats)
  {
    if (totalnoofseats>=seats)
    {
      totalnoofseats=totalnoofseats-seats;
      System.out.println("ticket booked "+seats);
    }
    else
    {
      System.out.println("No seats available!!");
    }
  }
}

public class sync extends Thread
{
  static bookticket b1;
  int seats;
  public void run()
  {
    b1.book1(seats);
  }
  public static void main(String[] args) 
  {
    b1= new bookticket();
    sync s1=new sync();
    s1.seats=5;
    s1.start();
    sync s2=new sync();
    s2.seats=4;
    s2.start();
    sync s3=new sync();
    s3.seats=1;
    s3.start(); 
  }
}

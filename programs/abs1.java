abstract class bike
{
    abstract void start();
    abstract void break1();
    void engine()
    {
        System.out.println("Engine is hot!!"); 
    }
}

class bikefunction extends bike
{
    void start()
    {
        System.out.println("Bike started"); 
    }
    void break1()
    {
        System.out.println("Apply break if needed"); 
    }
}
public class abs1 
{
    public static void main(String[] args)
    {
        bikefunction a1=new bikefunction();
        a1.start();
        a1.break1();
        a1.engine();
    }
}

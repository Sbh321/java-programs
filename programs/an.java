class animal
{
    void eat()
    {
        System.out.println("Eating");
    }

}

class bird extends animal
{
    void fly()
    {
        System.out.println("and Flying");
    }
}

public class an
{
    public static void main(String args[])
    {
        bird eagle=new bird();
            eagle.eat();
            eagle.fly();
    }
}
 


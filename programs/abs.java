//Demostrate abstraction and use of key word abstract.

abstract class a
{
    abstract int sum(int a, int b);
    
}

class c extends a
{
    int sum(int a,int b)
    {
        int s=a+b;
        return s;
    }
}

public class abs
{
    public static void main(String[] args)
    {
        c a1=new c();
        int S;
        S=a1.sum(1,2);
        System.out.println("Total: "+S); 
    }
}

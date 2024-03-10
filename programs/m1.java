public class m1
{
    int a,b;
    void sum()
    {
        int total;
        total=a+b;
        System.out.println("Total: "+total);
    }  
    public static void main(String[] args)
    {
        m1 a1=new m1();
        a1.a=5;
        a1.b=3;
        a1.sum();
    }
}

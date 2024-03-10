//Method overloading//
public class over
{
    int a,b,c;

    over(int a, int b, int c) // Constructor whose method name is same as class name
    {
        System.out.println("I am form constructor"); 
        int total;
        total=a+b+c;
        System.out.println("Total: "+total); 
    }

    void sum()
    {
        int total;
        total=a+b;
        System.out.println("Total: "+total); 
    }
    void sum(int a,int b)
    {
        int total;
        total=a+b;
        System.out.println("Total: "+total); 
    }  

    void sum(int a,int b,int c)
    {
        int total;
        total=a+b+c;
        System.out.println("Total: "+total); 
    }

    public static void main(String[] args)
    {
        over a1=new over(3,3,3);
        int a=1;   //this is a local veriable for main method
        int b=2;
        int c=3;
        a1.a=2;   //this is a instance veriable
        a1.b=2;
        a1.sum(a,b); 
        a1.sum(a,b,c);
        a1.sum();
        
    }
}


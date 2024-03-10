class addition
{
    void add(int a,int b)
    {
        System.out.println("Sum is: "+(a+b));
    }
}

class subtraction extends addition
{
    void sub(int a,int b)
    {
        System.out.println("Sub is: "+(a-b));
    }
}

class multiply extends subtraction
{
    void mul(int a,int b)
    {
        System.out.println("Mul is: "+(a*b));        
    }
}


public class haa
{   
    public static void main(String[] args)
    {
        multiply a1=new multiply();
        int a=1;
        int b=1;
        a1.add(a,b);
        a1.sub(a,b);
        a1.mul(a,b);
    }
}
//Explain the word final and give example in terms of class and veriable//
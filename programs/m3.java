//with passing value and return type//
public class m3
{
    int a,b,c;
    int sum()
    {
        int total;
        total=a+b;
        return total;    
    }  

    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args)
    {
        m3 a1=new m3();
        int a=6;
        int b=3;
        a1.set(a,b);
        int result;
        result=a1.sum();
        System.out.println("Total: "+result);   
        
    }
}


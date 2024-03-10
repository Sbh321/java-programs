public class getset 
{
    int a,b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int get()
    {
        int t;
        t=a;
        return t;
    }
    public static void main(String[] args)
    {
        getset a1=new getset();
        int a=3;
        int b=1;
        a1.set(a,b);
        int r;
        r=a1.get();
        System.out.println("Total: "+r);   
    }
}

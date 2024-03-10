public class ini 
{
    String name;
    ini(String n)
    {
        name=n;
    }
    void disname()
    {
        System.out.println("Your name is:  "+name);
    }
    public static void main(String[] args)
    {
        ini a1=new ini("Subham");
        a1.disname();
    }
}

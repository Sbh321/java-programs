class add
{
    int add(int x, int y)
    {
        return x+y;
    }
}
public class main 
{
    public static void main(String[] args)
    {
        int a=5;
        int b=6;
        add a1= new add();
        int sum = a1.add(a,b);
        System.out.println("The sum is: "+sum);
    }
}

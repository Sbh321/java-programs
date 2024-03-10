//with passing value and return type//
import java.util.*;
public class m2
{
    int a,b,c;
    void sum(int a,int b)
    {
        int total;
        total=a+b;
        System.out.println("Total: "+total);       
    }  
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the stack");
        int n = sc.nextInt();
        System.out.println("Size of the stack: "+n);
        
    }
}


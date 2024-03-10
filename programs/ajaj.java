
class student
{
    int id;
    String name;
    
}

class sports
{
    int id;
    String name;
    
}
public class ajaj
{
    public static void main(String[] args)
    {
        student s1=new student();
        sports s2=new sports();
        
        s1.id=1;
        s1.name="Utsav";
        s2.id=0020340;
        s2.name="Utsav";

        System.out.println("id "+s1.id);
        System.out.print("name "+s1.name);
    }
}

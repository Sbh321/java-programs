// ArrayIndexOutOfBoundsException

// public class array 
// {
//   public static void main(String[] args)  
//   {
//     String a[]={"Ram","Sam","Bahadur"};
//     System.out.println("Name: "+a[3]); 
//   }
// }

public class array 
{
  public static void main(String[] args)  
  {
    try
    {
      String a[]={"Ram","Sam","Bahadur"};
      System.out.println("Name: "+a[3]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Index is bigger than size of array");
    }
    finally
    {
      System.out.println("Couldnt catch the error");
    }
  } 
}


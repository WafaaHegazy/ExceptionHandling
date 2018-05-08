public class Main2
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            //This statement throws NumberFormatException
            Integer I = new Integer("abc");  
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}
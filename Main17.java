public class Main17
{
    public static void main(String[] args)
    {
        try
        {
            methodWithThrow();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException Re-thrown in methodWithThrow() method will be handled here");
        }
    }
 
    static void methodWithThrow()
    {
        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");
 
            throw ex;     //Re-throwing NullPointerException
        }
    }
}
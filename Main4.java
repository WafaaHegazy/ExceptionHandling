/*You can display the description of an exception 
thrown using Exception object in the catch block.*/
public class Main4
{
    public static void main(String[] args)
    {
        try
        {
            String s = null;
            //This statement throws NullPointerException
            System.out.println(s.length());   
            System.out.println("This statement will not be executed");
        }
        catch(Exception ex)
        {
            System.out.println(ex);    //Output : java.lang.NullPointerException
 
            ex.printStackTrace();     //This prints stack trace of exception
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }
}
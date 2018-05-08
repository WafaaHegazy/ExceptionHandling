/*The order of catch blocks should be from most specific to most general ones. 
i.e Sub classes of Exception must come first and super classes later. 
If you keep the super classes first and sub classes later, 
you will get compile time error : Unreachable Catch Block.*/
public class Main8
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
 
        catch(NumberFormatException ex)
        {
            System.out.println("This block handles NumberFormatException");
        }
 
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
 
        catch (Throwable ex)
        {
            System.out.println("Throwable is super class of Exception");
        }
    }
}
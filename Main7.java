/*java.lang.Exception is super class of all types of exception. 
It handles all types of exceptions.
all catch blocks can be replaced by one catch block which handles all types of exceptions. 
This type of exception handling comes very handy 
when you are not sure about the types of exceptions your code may throw.*/
public class Main7
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++)
        {
            try
            {
                //This statement may throw NumberFormatException, 
                //NullPointerException and ArrayIndexOutOfBoundsException
                int a = s[i].length() + Integer.parseInt(s[i]);       
 
            }
 
            catch(Exception ex)
            {
                System.out.println("This block handles all types of exceptions");
            }
        }
    }
}
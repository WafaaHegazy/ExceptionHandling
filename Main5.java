/*In some cases, A single statement may throw more than one type of exception. 
In such cases, Java allows you to put more than one catch blocks. 
One catch block handles one type of exception.  
When an exception is thrown by the try block, 
all the catch blocks are examined in the order they appear 
and one catch block which matches with exception thrown will be executed. 
After, executing catch block, program control comes out of try-catch unit.*/
public class Main5
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
                 System.out.println("Value : "+ a);
            }
 
            catch(NumberFormatException ex)
            {
                System.out.println("NumberFormatException will be caught here");
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            }
 
            catch (NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
 
            System.out.println("After executing respective catch block, this statement will be executed");
        }
    }
}
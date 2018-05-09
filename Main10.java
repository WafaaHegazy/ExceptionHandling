/*
If the exception thrown by the inner try block can not be caught by it’s catch block, 
then this exception is propagated to outer try blocks. 
Any one of the outer catch block should handle this exception 
otherwise program will terminate abruptly*/
public class Main10
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < s.length; i++)
        {
            System.out.println("************************************************"); 
            //First Level try-catch block
            try
            {
                //This statement may throw NullPointerException
                int a = s[i].length();    
 
                //second level try-catch block
                try
                {
                    //This statement may throw ArrayIndexOutOfBoundsException
                   String r=  s[i+1];   
 
                    //third level try-catch block
                    try
                    {
                        a = Integer.parseInt(s[i]);    
                    }
                    catch (NullPointerException e)
                    {
                        System.out.println("NumberFormatException will not be caught here");
                    }
                    finally{
                        System.out.println("one");

                    }
                }
                catch (NumberFormatException ex)
                {
                    System.out.println("NumberFormatException will be caught here");
                }finally{
                        System.out.println("two");

                    }
            }
            catch(Exception ex)
            {
                System.out.println("This block catches all types of exceptions" + ex);
            }finally{
                        System.out.println("three");

                    }
        }
    }
}
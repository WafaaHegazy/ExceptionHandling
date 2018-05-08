/*
try
{
    //This is the try block
    //In this block, keep those statements which may
    //throw run time exceptions
}
 
catch(Exception e)
{
    //This is the catch block.
    //It takes one argument of type java.lang.Exception
    //This block catches the exceptions thrown by try block
}
 
finally
{
    //This is the finally block.
    Whether exception is thrown or not and thrown exception is caught or not, 
    this block will be always executed.
}
*/public class Main3
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", "xyz", "456"};   //String Array containing valid and invalid numeric values
 
        for (int i = 0; i < s.length; i++)
        {
            try
            {
                //This statement may throw NumberFormatException
                int intValue = Integer.parseInt(s[i]); 
                System.out.println("Value: "+ intValue);
            }
              //You can't keep statements here
            catch(NumberFormatException ex)
            {
                System.out.println("The thrown NumberFormatException will be caught here");
            }
              //You can't keep statements here
            finally
            {
                System.out.println("This block is always executed");
            }
            System.out.println("You can keep any number of statements here");
        }
    }
}
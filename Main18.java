/*
If a method is capable of throwing an exception that it could not handle, 
then it should specify that exception using throws keyword. 
It helps the callers of that method in handling that exception
*/
public class Main18
{
    static void methodWithThrows() throws NumberFormatException, NullPointerException
    {
        int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
 
        String s = null;
 
        System.out.println(s.length());    //This statement throws NullPointerException
    }
 
    public static void main(String[] args)
    {
        try
        {
            methodWithThrows();
        }
        catch(Exception ex)
        {
            System.out.println("This block can handle all types of exceptions "+ex);
        }
    }
}
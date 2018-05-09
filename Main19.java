/*Even constructor can use throws keyword.
For this, object creation statement must be enclosed in try-catch blocks.*/

class A
{
    int i;
 
    public A(String s) throws NumberFormatException
    {
        i = Integer.parseInt(s);    //This statement throws NumberFormatException
    }
}
 
public class Main19
{
    public static void main(String[] args)
    {
        try
        {
            A a = new A("abc");    //Object creation statement enclosed in try-catch block
        }
        catch (NumberFormatException ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
    }
}
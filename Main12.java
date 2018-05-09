/*If method returns a value and also has try, 
catch and finally blocks in it, then following two rules need to follow.
1) If finally block returns a value 
then try and catch blocks may or may not return a value.

2) If finally block does not return a value 
then both try and catch blocks must return a value.*/
public class Main12
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            int a= 1/0;
            System.out.println("Now, finally block is always executed");
        }
        /*
        If try-catch-finally blocks are returning a value according to above rules, 
        then you should not keep any statements after finally block. 
        Because they become unreachable and in Java, 
        Unreachable code gives compile time error.
        */
        //System.out.println("Unreachable code");

    }
}
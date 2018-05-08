public class Main14
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue4());
    }
 
    static String methodReturningValue()
    {
        String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            return s;
        }
        finally
        {
            s = s + "return value from finally block";
        }
    }

 
    static int methodReturningValue1()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
            return i;
        }
        finally
        {
            i = 3;
        }
    }

     static int methodReturningValue2()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
        }
        finally
        {
            i = 3;
        }
 
        return i;
    }

    static int methodReturningValue3()
    {
        try
        {
            int i = Integer.parseInt("123");
            return 20;
        }
        finally
        {
            return 50;
        }
    }   

    static int methodReturningValue4()
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            return 20;
        }
        finally
        {
            return 50;
        }
    } 
}


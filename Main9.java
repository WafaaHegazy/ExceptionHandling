/*
try     //Outer try block
{
    //Some Statements
 
    try    //Inner try block
    {
        //Some Statements
    }
    catch (Exception ex)    //Inner catch block
    {
 
    }
}
catch(Exception ex)     //Outer catch block
{
 
}*/
public class Main9
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < s.length; i++)
        {
            try     //Outer try block
            {
                //This statement may throw NullPointerException
                int a = s[i].length();    
 
                try    //Inner try block
                {
                    //This statement may throw NumberFormatException
                    a = Integer.parseInt(s[i]);
                    System.out.println("Value : "+ a);    
                }
                catch (NumberFormatException ex)   //Inner catch block
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(NullPointerException ex)     //Outer catch block
            {
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}
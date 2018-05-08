/*From Java 7 onward, there is one more way for handling multiple exceptions. 
Multiple exceptions thrown by the try block 
can be handled by a single catch block using pipe (|) operator. 
*/
public class Main6
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
 
            catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Now, this block handles Exception : "+ex);
            }
        }
    }
}
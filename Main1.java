/*
An exception is an abnormal condition which occurs during run time
and disrupts the normal flow of the program.  
This exception must be handled to maintain the normal flow of the program. 
If this exception is not handled properly, the rest of the program will not be executed. 
*/
public class Main1
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
        //This statement throws NumberFormatException
        Integer I = new Integer("abc");  
 
        System.out.println("This statement will not be executed");
    }
}
/*If a super class method is throwing unchecked exception, 
then it can be overrided in the sub class with same exception or any other unchecked exceptions 
but can not be overrided with checked exceptions.*/
class SuperClass
{
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Super class method is throwing Unchecked exception");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Can be Overrided with same unchecked exception");
    }
}
 
class SubClassOne extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any other Unchecked Exceptions");
    }
}
 
class SubClassTwo extends SuperClass
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}
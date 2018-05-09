/*If super class method is throwing checked type of exception, 
then it can be overrided with same exception or with it’s sub class exceptions 
i.e you can decrease the scope of the exception, 
but can not be overrided with it’s super class exceptions 
i.e you can not increase the scope of the exception.*/
class SuperClass
{
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Super class method is throwing checked exception");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Can be Overrided with same checked exception");
    }
}
 
class SubClassOne extends SuperClass
{
    @Override
    void methodOfSuperClass() throws FileNotFoundException
    {
        System.out.println("Can be overrided with checked Exception with lesser scope");
    }
}
 
class SubClassTwo extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException
    {
        System.out.println("Can be overrided with any unchecked exceptions and checked exception with lesser scope");
    }
}
 
class SubClassThree extends SuperClass
{
    @Override
    void methodOfSuperClass() throws Exception
    {
        //Compile time error
        //Can not be overrided with checked exception with higher scope
    }
}
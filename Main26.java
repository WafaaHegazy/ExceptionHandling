public class Main26
{
    public static void main(String[] args)
    {
        int balance = 5000;            //Initializing the balance
 
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
 
        System.out.println("Enter Withdrawl Money");
 
        int withdrawlMoney = sc.nextInt();      //taking input from the user
 
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(withdrawlMoney > balance)
            {
                //throwing exception using anonymous inner class
 
                throw new ArithmeticException()
                {
                    @Override
                    public String toString()
                    {
                        return "You don't have that much of money in your account";
                    }
                };
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
    }
}
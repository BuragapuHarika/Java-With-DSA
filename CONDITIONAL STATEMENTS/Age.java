public class Age
{
    public static void main(String args[])
    {
        int age = 16;
        if(age >= 18)
        {
            System.out.println("Eligible to vote");
        }

        if(age > 13 && age < 18)
        {
            System.out.println("Teenager");
        }
        else 
        {
            System.out.println("Not Eligible to vote ");
        }
    }

}
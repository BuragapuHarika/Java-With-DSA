import java.util.*;
public class fact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int i = 1;
        int num;

        System.out.println("Enter your own number");
        num = sc.nextInt();

    

        for( i = 1; i <= num ; i++)
        {
            fact *= i ;
        }

       System.out.println("the factorial number is : " + fact);
    }
}
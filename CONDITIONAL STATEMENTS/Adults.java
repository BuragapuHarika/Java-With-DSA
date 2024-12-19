import java.util.*;
public class Adults {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("Adults");
        }
        else if (age >=  18 && age < 18)
        {
            System.out.println("Teenager");
        }
        else 
        {
            System.out.println("Not an Adults");

        }


    }
}

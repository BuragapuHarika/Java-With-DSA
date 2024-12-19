import java.util.Scanner;
public class largest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        int a = 6;
        int b = 3;
        int c = 1;

        if (a >= b && a >=c)
        {
            System.out.println("A");
        }

        else if (  b >= c)
        {
            System.out.println("b");
        }
        else {
            System.out.println("c");
        }




        
    }
}
/*Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side))*/
import java.util.Scanner;
public class Question2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s , area ;

        System.out.println("Enter the side of the square");
        s = sc.nextInt();
        area = s * s ;

        System.out.println("the area of the square is " + area);
    }
}
/*  Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem*/



import java.util.Scanner;
public class Question3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil:");
        float item1 = sc.nextFloat();
        System.out.println("Enter cost of pen:");
        float item2 = sc.nextFloat();
        System.out.println("Enter cost of eraser:");
        float item3 = sc.nextFloat();

        float subtotal = item1 + item2 + item3;
        float gst = (long) (subtotal * 0.18);
        float total = subtotal + gst;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST (18%): " + gst);
        System.out.println("Total: " + total);
    }
}
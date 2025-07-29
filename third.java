
import java.util.Arrays;

public class third {
    public static int number(int[] arr)
    {
        int n= arr.length;
        Arrays.sort(arr);

        return arr[n-3];

    }
    public static void main(String args[])
    {
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        System.out.println(number(arr));
    }
}

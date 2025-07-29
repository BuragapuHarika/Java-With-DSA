
import java.util.Arrays;

public class maximum {
    public static int numbers(int[] arr)
    {
        int n = arr.length;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i] == n)
            {
                count++;
            }

        }
        return count;
    }
     public static void main(String args[])
    {
        int[] arr = {1,0,0,0,0,1};
        System.out.println(numbers(arr));

    }
}

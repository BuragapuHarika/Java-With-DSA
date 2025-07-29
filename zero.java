public class zero
{
    public static int number(int[] arr)
    {
        int count = 0;
        //print all the non zeroes at first 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                
                System.out.print(arr[i] + " ");
            }

        }
        // now print for the all the zeros at the right hand side 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        return count;

    }
    public static void main(String args[])
    {
       int[]  arr = {1,0,6,0,8,0,4,0};
        System.out.println(number(arr));


    }
}
package Array_Hasging;
import java.util.*;

public class Duplicate{
    private static boolean find(int [] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3};
        System.out.println(find(arr));
    }
}

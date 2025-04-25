package Array_Hasging;
import java.util.*;
public class Duplicate_hash {
    private static boolean find(int [] arr)
    {
     int n=arr.length;
     int c=Arrays.stream(arr).distinct().count();
     return c<n;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3};
        System.out.println(find(arr));
    }
}

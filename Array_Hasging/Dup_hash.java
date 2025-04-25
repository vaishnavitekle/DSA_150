package Array_Hasging;

import java.util.*;

public class Dup_hash {
    private static boolean find(int [] arr)
    {
     Set<Integer> s=new HashSet<>();
     for(int n:arr)
     {
        s.add(n);
     }
     return s.size()!=arr.length;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3};
        System.out.println(find(arr));
    }
}

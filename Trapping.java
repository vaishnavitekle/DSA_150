package Two_Pointer;

import java.util.*;

public class Trapping {
    private static int find(int [] arr){
        int l=0,r=arr.length,w=0;
        int lmax=arr[0],rmax=arr[arr.length-1];
        while (l<r) {
            if(lmax<rmax)
            {
                l++;
                if(lmax<arr[l])
                {
                    lmax=arr[l];
                }
                else{
                    w=w+lmax-arr[l];
                }
            }
            else{
                r--;
                if(rmax<arr[r])
                {
                    rmax=arr[r];
                }
                else{
                    w=w+rmax-arr[r];
                }
            }
        }
        return w;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3};
        System.out.println(find(arr));
    }
}

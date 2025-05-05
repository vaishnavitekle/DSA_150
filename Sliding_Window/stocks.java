package Sliding_win;

public class stocks {
    private static int find(int[] arr){
        int l=0,r=1;
        int maxP=0;
        while (r<arr.length) {
            if(arr[l]<arr[r])
            {
                int p=arr[r]-arr[l];
                maxP=Math.max(maxP, p);
            }else{
                l=r;
            }
            r++;
        }
        return maxP;
    }
    public static void main(String[] args) {
        int arr[]={2,20,4,10,3,4,5};
        System.out.println(find(arr));
    }
}

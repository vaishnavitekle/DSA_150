package Array_Hasging;
import java.util.*;

public class Logest {
    private static int find(int [] arr){
        TreeSet<Integer> s=new TreeSet<>();
        for(int n:arr)
        {
            s.add(n);
        }

        Iterator<Integer> i=s.iterator();
        int f=i.next();
        int c=1,m=0;
        while (i.hasNext()) {
            int x=i.next();
            if(f==x-1)
            {
                c++;
                f=x;
            }
            else{
                m=Math.max(m, c);
                c=0;
                f=x;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int arr[]={2,20,4,10,3,4,5};
        System.out.println(find(arr));
    }
}

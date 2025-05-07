package Sliding_win;
import java.util.*;

public class substring {
    private static int find(String str){
     int l=0,res=0;
     HashMap m=new HashMap<>();
     for(int i=0;i<str.length();i++)
     {
        if(m.containsKey(str.charAt(i)))
        {
            l = Math.max(m.get(str.charAt(i)) + 1, l);
        }
        m.put(str.charAt(i), i);
        res = Math.max(res, i - l + 1);
     }
     return res;
    }
    public static void main(String[] args) {
        String s="madam madam";
        System.out.println(find(s));
    }
}

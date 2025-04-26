package Two_Pointer;

public class Palindrom {
     private static boolean find(String str){
        str=str.replaceAll(" ","");
        int s=0;
        int e=str.length()-1;
        while (s<=e) {
            if(str.charAt(s)!=str.charAt(e))
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="madam madam";
        System.out.println(find(s));
    }
}

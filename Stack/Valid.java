package Stack;
import java.util.*;
public class Valid {
    private static boolean find(String str){
        
        HashMap m=new HashMap<>();
        m.put('[',']');
        m.put('(',')');
        m.put('{','}');
        Stack s=new Stack<>();
        for(char c:str.toCharArray())
        {
            if(m.containsKey(c)){
                if(!s.isEmpty() && s.peek()==m.get(c))
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
            else{
            s.push(c);
            }
        }
        return s.isEmpty();
       }
       public static void main(String[] args) {
           String str="{[[]]}";
           System.out.println(find(str));
       }
}

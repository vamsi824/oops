import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("vamsi", 1);
        obj.put("ganesh", 2);
        obj.put("durga", 3);
        obj.put("praneeth", 4);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}

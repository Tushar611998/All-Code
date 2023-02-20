package Maps;
import java.util.HashMap;
import java.util.Set;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);


        // chieck presence of key
        if(map.containsKey("abc")){
            System.out.println("contains abc");
        }
        if(map.containsKey("abs")){
            System.out.println("contains abs");
        }else{
            System.out.println("not contains abs");
        }

        // get value of key
        int v = 0;
        if(map.containsKey("abc1")){
            v = map.get("abc");
        }
        int u = 0;
        if(map.containsKey("def")){
            u = map.get("def");
        }
        System.out.println("abc - "+v );
        System.out.println("def - "+u);
        System.out.println(map.size());
        // remove
        int r = map.remove("ghi");
        System.out.println(r);
        System.out.println(map.size());

        // iterate over keys
        Set<String> s = map.keySet();
        for(String str : s){
            System.out.println(str);
        }
    }
}

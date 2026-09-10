import java.util.HashMap;

public class hm_practice {
        public static void main(String[] args) {
    
            HashMap<String, Integer> map = new HashMap<>();
            map.put("1",50);
            map.put("2",60);
            map.put("3",70);
            System.out.println("Value for key 2: " + map.get("2"));
            map.remove("1");
            System.out.println("Map: " + map);
            System.out.println("size of map:"+map.size());



    
        }
    
}

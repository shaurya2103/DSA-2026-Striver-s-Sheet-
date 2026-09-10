import java.util.*;

public class hashmap {

        public static void main(String[] args) {
    
            HashMap<Integer, Integer> map = new HashMap<>();

            int arr[] = {1,2,1,3,2,1};

for(int num : arr)
{
    map.put(num,map.getOrDefault(num,0)+1);
}

System.out.println(map);
    
        }
    
}

package HashMap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> hm = new java.util.HashMap<>();

        hm.put("Apple",10);
        hm.put("Orange",10);
        hm.put("Mango",10);
        hm.put("Banana",10);

        System.out.println("value of apple"+hm.get("Apple"));

        for (Map.Entry<String,Integer> entry:hm.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value"+entry.getValue());
        }

        hm.remove("Banana");

        System.out.println("Contains key 'Banana'"+hm.containsKey("Banana"));

        System.out.println("Size of HashMap"+hm.size());
    }
}

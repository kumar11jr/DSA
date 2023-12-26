import java.util.*;
public class HashMapp{
    public static void main(String[] args) {

        // generating hashcode for string
        // String name = "Prabhat";
        // System.out.println(name.hashCode());


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Prabhat", 7);
        map.put("Kumar", 18);
        map.put("Hero", 70);
        System.out.println(map.get("Kumar"));
        // System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Apoorva", 99));
        System.out.println(map.size());


    }
}


 



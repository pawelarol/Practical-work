import HeavyBoxes.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> toyMap = new HashMap<>();
        toyMap.put("Teddy bear", 1);
        toyMap.put("Doll", 2);
        toyMap.put("Car", 3);

        Set<Map.Entry<String, Integer>> entrySet = toyMap.entrySet();
        showAll(entrySet);

        System.out.println(" ");
        System.out.println("EX 2");
        System.out.println(" ");

        showName(entrySet);

        System.out.println(" ");
        System.out.println("EX 3");
        System.out.println(" ");

       showValue(entrySet);


    }
       protected static void showAll(Set<Map.Entry<String, Integer>> entrySet) {
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
        protected static void showName(Set<Map.Entry<String,Integer>> name) {
            for (Map.Entry<String, Integer> entry : name) {
                String key = entry.getKey();
                System.out.println("Name Product: " + key);
            }
        }

        protected static void showValue(Set<Map.Entry<String, Integer>> showValue) {
            for (Map.Entry<String, Integer> entry : showValue) {
                int value = entry.getValue();
                System.out.println("Value: " + value);
                }
            }
    }


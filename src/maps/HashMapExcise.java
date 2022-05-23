package javaBasics.basics.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class HashMapExcise {



    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> cmap = new ConcurrentHashMap<>();

        HashMap<String,Integer> hm = new HashMap();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);



        LinkedHashMap<String,Integer> temp = hm.entrySet().stream().sorted((o1,o2) -> o1.getValue().compareTo(o2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2) -> o1,LinkedHashMap::new));
                //.collect(Collectors.toMap(keyMapper,valueMapper,binaryOperator,supplier));

            System.out.println(temp);

    }
    public static Function<Map.Entry<String,Integer>,String> keyMapper = new Function<Map.Entry<String, Integer>, String>() {
        @Override
        public String apply(Map.Entry<String, Integer> stringIntegerEntry) {
            return stringIntegerEntry.getKey();
        }
    };

    public static Function<Map.Entry<String,Integer>,Integer> valueMapper = new Function<Map.Entry<String, Integer>, Integer>() {
        @Override
        public Integer apply(Map.Entry<String, Integer> stringIntegerEntry) {
            return stringIntegerEntry.getValue();
        }
    };

    public static BinaryOperator<Map.Entry<String,Integer>> binaryOperator = new BinaryOperator<Map.Entry<String, Integer>>() {
        @Override
        public Map.Entry<String, Integer> apply(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> stringIntegerEntry2) {
            return stringIntegerEntry;
        }
    };

    public static Supplier<LinkedHashMap<String,Integer>> supplier = new Supplier<LinkedHashMap<String, Integer>>() {
        @Override
        public LinkedHashMap<String, Integer> get() {
            return new LinkedHashMap<>();
        }
    };


}

package com.xworkz.mapmethods.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonRunner {
    public static void main(String[] args) {


        Map<String, Long> map = new HashMap<>();
        String person1 = "lavanya";//external
        long mobileNo1 = 7769213946l;
        String person2 = "monika";
        long mobileNo2 = 7204315223l;
        map.put(person1, mobileNo1);
        map.put(person2, mobileNo2);

        map.put("meena", 9902521442l);//internal
        map.put("pushpa", 7760213956l);
        map.put("kavya", 7766005789l);
        map.put("pragna", 9878566545l);

        Map<String, Long> map1 = new HashMap<>();
        map1.put("megha", 9901198765l);
        map1.put("ramya", 9902255667l);
        map1.put("kavana", 7700221678l);
        map1.put("janu", 9901164763l);


        System.out.println("1.Displaying all the elements......using put()");
        map.forEach((n1, n2) -> System.out.println("name - " + n1 + " : " + "mobile - " + n2));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("2.putAll() method...");
        System.out.println("Map before using putAll():");
        map.forEach((name, mobileNo) -> System.out.println("name - " + name + " : " + "mobile - " + mobileNo));
        map.putAll(map);

        System.out.println("+++++++++++++++++");
        System.out.println("Map1 before using putAll():");
        map1.forEach((name, mobileNo) -> System.out.println("name - " + name + " : " + "mobile - " + mobileNo));
        map.putAll(map1);

        System.out.println("+++++++++++++++++");
        System.out.println(" after using putAll():");
        map.forEach((name, mobileNo) -> System.out.println("name - " + name + " : " + "mobile - " + mobileNo));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("3.Map Entries after using putIfAbsent():");
        map.putIfAbsent("lavanya", 9999999999L);
        map.putIfAbsent("karan", 8888888888L);
        map.forEach((name, mobileNo) -> System.out.println("Name: " + name + " : Mobile - " + mobileNo));
        System.out.println("+++++++++++++++++");

        System.out.println("4.printing only the keys..using keyset() ");
        Set<String> key = map.keySet();
        map.forEach((k1, k2) -> System.out.println(k1));
        System.out.println("+++++++++++++++");

        System.out.println("5.printing only the values..using values() ");
        map.values();
        map.forEach((v1, v2) -> System.out.println(v2));
        System.out.println("+++++++++++++++");

        System.out.println("6. size of map..using size() " + map.size());
        System.out.println("+++++++++++++++++++");

        System.out.println("7.checking whether the map is empty or not..using isEmpty()");
        System.out.println(map.isEmpty());
        System.out.println("+++++++++++++++++++");

        System.out.println("8.contains key method... using containsKey()");
        System.out.println(map.containsKey("anand"));
        System.out.println("+++++++++++++++++++");

        System.out.println("9.contains value method...using containsValue()");
        System.out.println(map.containsValue(9901164763l));
        System.out.println("+++++++++++++++++++");

        System.out.println("10.get method...using get()");
        System.out.println(map.get("pushpa"));
        System.out.println("+++++++++++++++++++");

        System.out.println("11.remove key 'kavya'...using remove()");
        System.out.println(map.remove("kavya"));
        map.forEach((n1, n2) -> System.out.println("name - " + n1 + " : " + "mobile - " + n2));
        System.out.println("+++++++++++++++++++");

        System.out.println("12.entryset():" + map1.entrySet());
        System.out.println("entryset():" + map.entrySet());
        System.out.println("+++++++++++++++++++");

        System.out.println("13.equals() :" + map.entrySet().equals(map1.entrySet()));
        System.out.println("+++++++++++++++++++");

        System.out.println("14.hashcode():" + person1.hashCode());
        System.out.println("++++++++++++++++++++++");

        System.out.println("15.getOrDefault():...");
        Long mobileLavanya = map.getOrDefault("lavanya", 0000000000L);
        Long mobileram = map.getOrDefault("rama", 0000000000L);
        System.out.println("Mobile number for lavanya which exist in map: " + mobileLavanya);
        System.out.println("Mobile number for rama which does not exist: " + mobileram);
        System.out.println("+++++++++++++++++++++");

        System.out.println("16.merge():..");
        long lavanyamob = map.merge("lavanya", 2L, (oldValue, newValue) -> oldValue + newValue);
        long kiranmob = map.merge("kiran", 8888888888L, (oldValue, newValue) -> oldValue);
        System.out.println("lavanya mobile number is updated by incrementing by 2:" + mobileNo1 + "-" + lavanyamob);
        System.out.println("kiran mobile number is not asscociated in map :" + kiranmob);
        System.out.println("+++++++++++++++++++++");

        System.out.println("17.Map Entries after removing 'lavanya' with one parameter:");
        map.remove("lavanya");
        map.forEach((name, mobileNo) -> System.out.println("Name: " + name + " : Mobile - " + mobileNo));
        System.out.println("+++++++++++++++++++++");

        System.out.println("18.Map Entries after removing 'janu' with two parameter:");
        map.remove("janu", 9901164763l);
        map.forEach((name, mobileNo) -> System.out.println("Name: " + name + " : Mobile - " + mobileNo));
        System.out.println("+++++++++++++++++++++");

        System.out.println("19.Map Entries after replacing 'meena' using replace() with 2 parameter:");
        map.replace("meena", 9901164764l);
        map.forEach((name, mobileNo) -> System.out.println("Name: " + name + " : Mobile - " + mobileNo));
        System.out.println("+++++++++++++++++++++");

        System.out.println("20.Map Entries after replacing 'meena' using replace() with 3 parameter:");
        boolean updateno = map.replace("meena", 9901164764l, 7204315523l);
        System.out.println("Name: meena : Mobile :" + map.get("meena") + updateno);
        System.out.println("+++++++++++++++++++++");

        System.out.println("21.Map entries after using replaceAll() of mobile no with incrementing 1:");
        map1.replaceAll((k1, v1) -> (v1 + 1l));
        map1.forEach((k1, v1) -> System.out.println("Name: " + k1 + " : Mobile - " + v1));
        System.out.println("+++++++++++++++++++++++++");

        System.out.println("22.Compute():...");
        map.compute("megha", (keyName, Value) -> Value == null ? 9999999999L : Value + 1);
        map.compute("nandini", (keyName, Value) -> 88888888800L);
        System.out.println("Updated map entries:");
        map.forEach((n1, n2) -> System.out.println("name - " + n1 + " : " + "mobile - " + n2));
        System.out.println("++++++++++++++++++");

        System.out.println("23.computeIf():...");
        map.computeIfAbsent("newPerson", keyName -> 8888888888L);
        map.computeIfAbsent("megha", keyName -> 9999999999L);
        map.forEach((n1, n2) -> System.out.println("name - " + n1 + " : " + "mobile - " + n2));

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("24.clearing all map..using clear()");
        map.clear();
        map.forEach((k1, v1) -> System.out.println("Name: " + k1 + " : Mobile - " + v1));


    }

}

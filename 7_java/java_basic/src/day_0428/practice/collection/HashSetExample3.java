package day_0428.practice.collection;

import java.util.*;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String >();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        for (String s : set){
            System.out.println(s);
        }
    }
}

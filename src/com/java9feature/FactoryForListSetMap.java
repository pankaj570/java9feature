package com.java9feature;

import java.util.*;

import static java.util.Map.entry;

/*
 * 1. Factory Methods for Immutable List, Set, Map and Map.Entry
 *
 * */
public class FactoryForListSetMap {
    public static void main(String[] args) {

        //As per java 9 feature we can make immutable list using of() method of List, Set, Map
        List<String> list1 = List.of("pankaj", "Manish");
        //list1.add("Raju"); // not allowed to insert due to immutablity nature
        System.out.println(list1);

        //set
        Set<String> set = Set.of("pankaj", "Mohan");
        //set.add("Raju"); not allowed to insert due to immutablity nature
        System.out.println("Set :" + set);

        //Map
        Map<String, Integer> map = Map.of("a", 1, "b", 2);
        //map.put("c",3); // not allowed to insert due to immutablity nature
        System.out.println(map);
        Map<Integer, String> mapEntry = Map.ofEntries(
                entry(1, "a"),
                entry(2, "b"),
                entry(3, "c"),
                entry(26, "z"));
       // mapEntry.put(27,"27"); // not allowed to insert due to immutablity nature
        System.out.println(mapEntry);

    }
}

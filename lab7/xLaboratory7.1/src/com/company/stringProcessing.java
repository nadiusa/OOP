package com.company;

import java.util.*;

public class stringProcessing {
    void showTop(String [] text) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : text) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> counter1, Map.Entry<String, Integer> counter2 )
            {
                return (counter2.getValue()).compareTo( counter1.getValue() );
            }
        } );

        System.out.println("Top five words in these sentences are:");
        System.out.println();
        for (int j=0; j<=4;j++) {

            System.out.println("The " + (j+1)+ " " + "word is:---" +list.get(j).getKey() + "---and its frequency is: " + list.get(j).getValue());
          }

    }
}

package examples;

import java.util.LinkedHashMap;

import java.util.HashMap;


public class LinkedHashMapDemo {



    public static void main(String args[]) {



        HashMap<String, Integer> stocks = new LinkedHashMap<>(16, 0.75f, true);


        stocks.put("Apple", 123);

        stocks.put("BMW", 54);

        stocks.put("Google", 87);

        stocks.put("Microsoft", 232);

        stocks.put("Oracle", 76);



        stocks.get("Google");

        stocks.get("BMW");



        System.out.println(stocks);

    }


}

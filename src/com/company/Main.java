package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car,CarInfo>  hashmap = new HashMap<>();
        hashmap.put(new Car("12345",2001),new CarInfo("Audi",2021,25000,"кара"));

        for (Map.Entry res:hashmap.entrySet()) {
            System.out.println(res);
        }

    }
}

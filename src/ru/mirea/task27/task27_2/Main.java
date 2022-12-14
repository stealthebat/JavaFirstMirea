package ru.mirea.task27.task27_2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static HashMap<String, String> createMap() {
        HashMap <String, String> hm = new HashMap<String, String>();

        hm.put("Petrov", "Ivan");
        hm.put("Aliev", "Ruslan");
        hm.put("Lomov", "Sergey");
        hm.put("Lopatin", "Andrey");
        hm.put("Kokorin", "Alexander");
        hm.put("Strelkov", "Sergey");
        hm.put("Ribov", "Max");
        hm.put("Gromov", "Pavel");
        hm.put("Somov", "Kirill");
        hm.put("Panin", "Danil");

        return hm;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for (String s : map.values())
            if (s.equals(name))
                count += 1;
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String s : map.keySet())
            if (s.equals(lastName))
                count += 1;
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> hm = createMap ();
        System.out.println(hm);
        System.out.println("People with name Sergey: " + getSameFirstNameCount (hm, "Sergey" ));
        System.out.println("People with last name Petrov: " + getSameLastNameCount (hm, "Petrov" ));
    }
}

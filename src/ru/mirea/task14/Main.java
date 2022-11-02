package ru.mirea.task14;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task two:");
        taskTwo();
        System.out.println("Task three:");
        taskThree();
        System.out.println("Task seven:");
        taskSeven();
        System.out.println("Task eight:");
        taskEight();
        System.out.println("Task nine:");
        taskNine();
    }

    private static void taskTwo() {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern.matcher("notthis");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
    private static void taskThree() {
        Pattern pattern = Pattern.compile("(?:\\s|^)(\\d+(\\.\\d{1,2})?) \\b(?:USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher("2 USD, 5.12 RUB, 10 ER, 12 EU");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    private static void taskSeven() {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher matcher = pattern.matcher("F032_Password");
        Matcher matcher1 = pattern.matcher("smart_pass");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());

    }

    private static void taskNine() {
        HashMap<Character, Integer> frequencyDict = new HashMap<Character, Integer>();
        String sampleText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        for (int i = 0; i < sampleText.length(); i++) {
            if (sampleText.substring(i, i+1).matches("[a-zA-Z]"))
                frequencyDict.put(sampleText.charAt(i), frequencyDict.getOrDefault(sampleText.charAt(i), 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(frequencyDict.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        Map<Character, Integer> sortedFreqDict = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedFreqDict.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Frequency dictionary: ");
        for (Map.Entry<Character, Integer> entry : sortedFreqDict.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void taskEight() {
        String[] strings = new String[] {
                "abc", null, "314", "", "Sds"
        };

        Integer[] ints = new Integer[] {
                42, 0, 6655, null, 952
        };

        System.out.println("Arrays before filtering");
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));

        String[] stringRes = (String[]) filter(strings, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });

        Integer[] integerRes = (Integer[]) filter(ints, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null && !o.equals(0);
            }
        });

        System.out.println("Arrays after filtering");
        System.out.println(Arrays.toString(stringRes));
        System.out.println(Arrays.toString(integerRes));
    }

    private static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - offset);
    }
}

interface Filter {
    boolean apply(Object o);
}

package collections_examples;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        Map<String,String> colorsDescription = new HashMap<String,String>();

        colorsDescription.put("apple", "red"); // apple - klucz red - value
        colorsDescription.put("banana", "yellow");
        colorsDescription.put("kiwi", "green");
        System.out.println(colorsDescription);
        System.out.println(colorsDescription.get("kiwi"));
        System.out.println(colorsDescription.get("banana"));
        System.out.println(colorsDescription.keySet());
        colorsDescription.replace("apple", "mixed"); // zmiana value
        System.out.println(colorsDescription);
        System.out.println(colorsDescription.containsKey("strawberry"));
        System.out.println(colorsDescription.containsKey("banana"));
        System.out.println(colorsDescription.values()); // zbieramy wszystkie wartości
        for (String fruit: colorsDescription.keySet()
        ) {
            System.out.println("To jest owoc: " + fruit + " a jego kolor to: " + colorsDescription.get(fruit));
        }
        System.out.println(colorsDescription.size());
    }
}

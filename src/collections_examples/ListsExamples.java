package collections_examples;

import java.util.ArrayList;
import java.util.List;

public class ListsExamples {
    public static void main (String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Wojtek");
        System.out.println(nameList);
        nameList.add("Agata");
        nameList.add("Tomasz");
        nameList.add("Ania");
        System.out.println(nameList);

        nameList.add(1, "Dominika");
        System.out.println(nameList);
        System.out.println(nameList.get(3));
        //odpowiednik tab[3]

//        nameList.sort(null);
//        System.out.println(nameList);

        nameList.add("Wojtek");
        System.out.println(nameList);
        System.out.println(nameList.lastIndexOf("Wojtek"));  // podanie numeru indexu pod krótym występuje
        nameList.remove("Tomasz"); // usuwanie elementu
        System.out.println(nameList);
        nameList.set(4, "Kamil"); // pod index numer 4 wtawiamy imię Kamil
        System.out.println(nameList);
        System.out.println(nameList.contains("Agata")); // czy zawiera już podaną daną
        nameList.clear();
        System.out.println(nameList);

    }
}

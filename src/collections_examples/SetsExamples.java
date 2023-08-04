package collections_examples;

import java.util.HashSet;
import java.util.Set;

public class SetsExamples {
    public static void main (String[] args) {
        Set<Integer> numsSet = new HashSet<Integer>();

        numsSet.add(3);
        numsSet.add(8);
        numsSet.add(1);
        System.out.println(numsSet);
        numsSet.add(1); // dodaje tylko unikalne watrości
        System.out.println(numsSet);
        System.out.println(numsSet.size());
        System.out.println(numsSet.contains(9));

    }
}

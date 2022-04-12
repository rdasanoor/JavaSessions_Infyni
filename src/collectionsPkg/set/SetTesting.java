package collectionsPkg.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(null);

        System.out.println(set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1000);
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1000);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
//        treeSet.add(null);

        System.out.println(treeSet);
    }
}

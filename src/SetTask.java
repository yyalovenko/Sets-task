import Entity.Counter;

import java.util.HashSet;
import java.util.Set;

import static Entity.Counter.getCount;

public class SetTask {

    public static void setTask01() {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");
        System.out.println("Initial data:");
        printSet(set);
        System.out.println();
        set.add("grape");
        System.out.println("Updated data:");
        printSet(set);
        System.out.println();
    }

    public static void setTask02() {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");
        System.out.println("Initial data:");
        printSet(set);
        System.out.println();
        set.remove("kiwi");
        System.out.println("Updated data:");
        printSet(set);
    }


    public static void printSet(Set<String> set) {
        int i = 0;
        for(String s: set) {
            System.out.println(Counter.getCount(i) + s);
            i++;
        }
    }

}

package Datastructures;

import java.util.Arrays;
import java.util.HashSet;

//Set Theory
public class SetTheory {
    public static void setTheory() {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34, 100, 99));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49, 100));
        HashSet<Integer> c = new HashSet<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10, 100));

        System.out.println(getUnionSet(a, b));
        System.out.println(getIntersectionSet(b, c));
        System.out.println(getDifferenceSet(a, b));
        System.out.println(getUnionSet(a, getIntersectionSet(b, getDifferenceSet(c, a))));
    }

    private static HashSet<Integer> getUnionSet(HashSet<Integer> unionA, HashSet<Integer> unionB) {
        HashSet<Integer> result = new HashSet<>();

        result.addAll(unionA);
        result.addAll(unionB);

        return result;
    }

    private static HashSet<Integer> getIntersectionSet(HashSet<Integer> intersectionA, HashSet<Integer> intersectionB) {
        intersectionA.retainAll(intersectionB);

        return intersectionA;
    }

    private static HashSet<Integer> getDifferenceSet(HashSet<Integer> differenceA, HashSet<Integer> differenceB) {
        differenceA.removeAll(differenceB);

        return differenceA;
    }
}

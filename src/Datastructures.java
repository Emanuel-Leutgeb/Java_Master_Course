import java.util.*;

public class Datastructures {
    //Set theory with ArrayList --FALSE--
    public static void setTheoryArrayList() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49, 100));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10, 100));

        System.out.println(getUnionList(b, c));
        System.out.println(getIntersectionList(b, c));
        System.out.println(getUnionList(a, getIntersectionList(b, c)));
    }

    private static ArrayList<Integer> getUnionList(ArrayList<Integer> unionA, ArrayList<Integer> unionB) {
        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(unionA);
        result.addAll(unionB);
        Collections.sort(result);

        return result;
    }

    private static ArrayList<Integer> getIntersectionList(ArrayList<Integer> intersectionA, ArrayList<Integer> intersectionB) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer integer : intersectionA) {
            for (Integer value : intersectionB) {
                if (integer.equals(value)) {
                    result.add(value);
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    //Set theory with HashSet
    public static void setTheoryHashSet() {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34, 100, 99));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49, 100));
        HashSet<Integer> c = new HashSet<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10, 100));

        System.out.println(getUnionSet(b, c));
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

        //Dictionary
        public static void dictionary () {
            HashMap<String, String> myDictionary = new HashMap<>();


            myDictionary.put("Guten Morgen", "Good Morning");
            myDictionary.put("Österreich", "Austria");
            myDictionary.put("Annanas", "Pineapple");

            myDictionary.remove("Österreich");


            System.out.println(myDictionary);

        }

        //Sorting algorithm with ArrayList
        public static void bubbleList () {
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
            int temp;
            for (int i = 0; i < arr.get(arr.size() - 1); i++) {
                for (int j = 0; j < arr.size() - (1 + i); j++) {
                    if (arr.get(j) > arr.get(j + 1)) {
                        temp = arr.get(j + 1);
                        arr.remove(j + 1);
                        arr.add(j + 1, arr.get(j));
                        arr.remove(j + 1);
                        arr.add(j, temp);
                    }
                }
            }
            System.out.println(arr);
        }
    }

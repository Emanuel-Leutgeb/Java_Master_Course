import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Datastructures {
    //Set theory
    public static void setTheory() {
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

    //Dictionary
    public static void dictionary() {
        HashMap<String, String> myDictionary = new HashMap<String, String>();


        myDictionary.put("Guten Morgen", "Good Morning");
        myDictionary.put("Österreich", "Austria");
        myDictionary.put("Annanas", "Pineapple");

        myDictionary.remove("Österreich");


        System.out.println(myDictionary.toString());

    }

    //Sorting algorithm with ArrayList
    public static void bubbleList() {
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
        System.out.println(arr.toString());
    }
}

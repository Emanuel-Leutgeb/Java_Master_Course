package Datastructures;

import java.util.HashMap;

//Dictionary
public class Dictionary {
    public static void dictionary() {
        HashMap<String, String> myDictionary = new HashMap<>();
        //put
        myDictionary.put("Guten Morgen", "Good Morning");
        myDictionary.put("Österreich", "Austria");
        myDictionary.put("Annanas", "Pineapple");
        //remove
        myDictionary.remove("Österreich");

        System.out.println(myDictionary);
    }
}

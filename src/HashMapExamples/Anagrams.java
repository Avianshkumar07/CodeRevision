package HashMapExamples;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {


        String str1 = "Silent";
        String str2 = "Listen";

        str1 = str1.replace("\\s+" , "").toLowerCase();
        str2= str2.replace("\\s+" , "").toLowerCase();

        boolean result = areAnagrams(str1,str2);
        System.out.println("Are anagrams " + result);
    }

    public static boolean areAnagrams(String str1, String str2){

        //check edge case

        if (str2.length() != str1.length()) return false;

        //create a hashmap,

        HashMap<Character, Integer> map = new HashMap<>();

        //iterate over str1, and store the keyvalue

        for (char ch : str1.toCharArray()) {

            //if char exists, increment the count and if not store it map with count 1

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
            //we will work on str2
            //iterate over str2 and if the characters which are already stored in map
            //is not same as character in str2 , return false

            for (char ch : str2.toCharArray()){
                if (!map.containsKey(ch)) return  false;

                //Decreases the frequency of the current character.
                //If s had frequency 1, now it becomes 0.
                map.put(ch, map.get(ch) -1);

                //If the frequency becomes zero after subtracting, we remove that character from the map.
                //This helps keep the map clean.
                if (map.get(ch) == 0) map.remove(ch);
            }

        //After the loop, if all characters matched and balanced, the map should be empty.
        //If it's empty → all characters canceled out → ✅ they are anagrams.
        //If not empty → ❌ not anagrams

        return map.isEmpty();
    }
}

package HashMapExamples;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {


        String str1 = "Silent";
        String str2 = "Listen";

        boolean result = isAnagram(str1, str2);
        System.out.println(" Is Anagram? " + result);

    }
        public static  boolean isAnagram(String str1, String str2){

        //convet and remove space
        str1 = str1.replace("\\s+" , "").toLowerCase();
        str2 = str2.replace("\\+s","").toLowerCase();

        //check the edge case
            if ((str1.length() != str2.length())) return  false;

        //create hashmap

            HashMap<Character, Integer> map = new HashMap<>();

            //iterate over str1 and store char in map
            for (char ch : str1.toCharArray()){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }

            //since we have hashmap with all char of str1 in it,
            //iterate over str2 and check if all chars are same as str1
            //if not return false

            for (char ch : str2.toCharArray()) {
                if (!map.containsKey(ch)) return false;


                //if yes, start reducing/cancelling each character from
                map.put(ch, map.get(ch) - 1);

                //upon cancelling all char, if char in map == 0, means its anagram
                //thus remove all the char from map make it empty

                if (map.get(ch) == 0) map.remove(ch);

            }

            //After the loop, if all characters matched and balanced, the map should be empty.
            //If it's empty → all characters canceled out → ✅ they are anagrams.
            return map.isEmpty();

    }
}

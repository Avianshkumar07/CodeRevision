package HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        //take the input

        String input = "sswizz";

        input = input.toLowerCase();

        //crete a hashmap

        HashMap<Character,Integer> map = new HashMap<>();

        //iterate over map

        for (char ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1 );
        }

        //count the character
        char mostfrequent = '\0';
        int maxCharCount = 0;


        for (Map.Entry<Character,Integer> entry : map.entrySet()){

            if (entry.getValue() > maxCharCount){
                mostfrequent = entry.getKey();
                maxCharCount = entry.getValue();
            }

        }
         if (maxCharCount ==1 ) System.out.println("All having same frequency");

         else System.out.println("Most frequent character : " + mostfrequent);
    }
}

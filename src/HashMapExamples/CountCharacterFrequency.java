package HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {

    public static void main(String[] args) {

        //input
        String sentence = "Hhello avin  World";

        //convert to lowercase

        sentence  = sentence.toLowerCase();

        //create a hahmap to store key & value

        HashMap<Character ,Integer> charCount = new HashMap<>();

        //iterate over each and also parse the charcter from word

        for (char ch : sentence.toCharArray()){
            //if char already exists update the count in hashmap
            if (charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch) + 1);
            }
            //else add new char in hashmap with count 1

            else {
                charCount.put(ch,1);
            }
        }

        //iterate over map and print the entryset (key value)

//        for (Map.Entry<Character,Integer> entry : charCount.entrySet()){
//
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
        //or u cna use simple print

        System.out.println(charCount);
    }
}

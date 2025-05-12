package HashMapExamples;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        //take input
        String input = "hello world";

        //convert them in lowercase

        input = input.toLowerCase();

        //remove all space
        input = input.replace("\\s+" , "");

        //create hashmap to store char and its frequency

        HashMap<Character,Integer> count = new HashMap<>();


        //iterate over each chracter by converting word into character

        for (char res : input.toCharArray()){
            //if char already exists update the count
            if (count.containsKey(res)){
                count.put(res, count.get(res)+1);
            }
            //else add them in hashmap with frequency 1
            else {
                count.put(res,1);
            }
        }

        //iterate over map and print the char having count >1

        for (Map.Entry<Character,Integer> entry : count.entrySet()){

            if (entry.getValue()>1){
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }
}

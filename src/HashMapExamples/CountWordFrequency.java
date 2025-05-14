package HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class CountWordFrequency {

    public static void main(String[] args) {


        //take the input
        String sentence = " apple Banana Apple Orange Banana Apple ";

        //make empty string array to store result
        sentence = sentence.toLowerCase();
        String[] result = sentence.split("\\s+");

        //create a hashmap

        HashMap<String,Integer> map = new HashMap<>();

        //iterate over sentence,covert word in char and
        // if char  exists increment the count
        //if char doesnt exists add the ch, with count 1

        //alternate way
        /*for( String word : words){

            //if word already exists update the hashmap

            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            //else add new word in hashmap

            else {
                wordCount.put(word,1); //key : word ,

         */


        for (String word : result){
           map.put(word, map.getOrDefault(word,0) +1);
        }

        //iterate over map and print

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }



    }
}

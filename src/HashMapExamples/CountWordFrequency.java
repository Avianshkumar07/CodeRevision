package HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class CountWordFrequency {

    public static void main(String[] args) {


        //take the input
        String sentence = " apple banana apple orange banana apple ";


        //split the sentence into words and store in String array

        String[] words = sentence.split(" ");

        //create new hashmap

        HashMap<String,Integer> wordCount = new HashMap<>();

        //make a for loop, iterate thru each word

        for( String word : words){

            //if word already exists update the hashmap

            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            //else add new word in hashmap

            else {
                wordCount.put(word,1); //key : word , value : 1
            }
        }

        //print the words with value
        //iterate thru  each hashmap entry(key-value)

        for (Map.Entry<String,Integer> entry : wordCount.entrySet()){

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

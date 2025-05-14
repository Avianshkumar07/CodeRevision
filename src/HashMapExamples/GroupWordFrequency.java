package HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class GroupWordFrequency {

    public static void main(String[] args) {

        String[] words = {"cat" ,"dog","cat","bird" ,"Dog" , "Cat"};

        //just converted them in lowercase
        for (int i =0 ; i < words.length ; i++)
            words[i] = words[i].toLowerCase();

        //create a hashmap to store

        HashMap<String , Integer> map = new HashMap<>();

        //iterate over each word in String array,
        //store the word and update the count
        //aslo if word is present increment the count

        for (String word : words){
            map.put(word, map.getOrDefault(word,0) +1);
        }

       //for (Map.Entry<String,Integer> entry : map.entrySet()){
           //System.out.println(entry.getKey() + "-> " + entry.getValue());}

        System.out.println(map);

    }
}

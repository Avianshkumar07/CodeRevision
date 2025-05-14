package HashMapExamples;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Word : ");
        String str = sc.next();

        str = str.toLowerCase();

     // Call method that returns Optional
        Optional<Character> result = firstNonRepeating(str);

        //check edge case
        if (result.isPresent()) System.out.println("First Non Repeating Character : " + result);

        else System.out.println("No Non Repeating character found !!!");

        //create a hashmap
    }

    public static  Optional<Character> firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        //iterate thru each char of word

        for (char ch : str.toCharArray()) {
            //put the char in map, if doesnt exists add to map, if exists increment the value

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //find the first character with count =1

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return Optional.of(ch);
            }
        }
        return Optional.empty();
    }
}

package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumber {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        //apply stream

        List<Integer> evenNumber = num.stream()
                .filter(n -> n%2==0).sorted()
                .collect(Collectors.toList());

        System.out.println( evenNumber);
    }
}

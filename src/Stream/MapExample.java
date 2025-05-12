package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6);

        List<Integer> result = number.stream()
                .map(n -> n*3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

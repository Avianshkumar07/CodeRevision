package Stream;

import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,4,5,7,9,1);

        int sum = num.stream().reduce(0,Integer::sum);

        System.out.println("Sum : " + sum);
    }
}

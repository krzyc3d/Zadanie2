import java.util.*;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {

        int[] input = new int[]{3,321,2,421,5,22567,1,6,2354,2,6,368,4,2,1,5,7,9,8,13,124,126,464};


        var inputWithoutDuplicates = Arrays.stream(input).boxed().collect(Collectors.toSet());

        var list = new ArrayList<>(inputWithoutDuplicates);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);


    }
}

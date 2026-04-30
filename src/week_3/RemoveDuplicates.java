package week_3;

    import java.util.Arrays;
import java.util.LinkedHashSet;

    public class RemoveDuplicates {
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 2, 3, 4, 4, 5};

            LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers));

            System.out.println("Array after removing duplicates: " + set);
        }
    }

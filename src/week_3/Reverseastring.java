package week_3;

public class Reverseastring {
        public static void main(String[] args) {
            String input = "hello";
            String reversed = new StringBuilder(input).reverse().toString();

            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
        }
    }

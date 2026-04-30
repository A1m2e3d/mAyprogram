package week_4;

    import java.util.Arrays;

                   public class insertElement {
                   public static void main(String[] args) {
                  int[] originalArray = {1, 2, 4, 5};
                 int elementToInsert = 3;
                 int position = 2; // Index where we want the new element

                int[] newArray = new int[originalArray.length + 1];

                for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position) {
                    newArray[i] = elementToInsert;
                } else {
                    newArray[i] = originalArray[j++];
                }
            }

            System.out.println("New Array: " + Arrays.toString(newArray));
        }
    }


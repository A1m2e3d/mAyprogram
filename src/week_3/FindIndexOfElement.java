package week_3;

public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] mySum = { 67, 56, 78, 87 };
        int move = 4;

        int[] movesum = new int[mySum.length + 1];

        for (int i = 0; i < movesum.length; i++) {
            if (i ==0) {
                movesum[i] = move;
            } else {
                movesum[i] = mySum[i - 1];
            }

            System.out.println("At index " + i + " value is: " + movesum[i]);
        }
    }
}
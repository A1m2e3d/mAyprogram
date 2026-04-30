package week_3;

public class Average {
    public static void main(String[] args) {
        int[] myAhmea = {45 , 67 , 5 , 78 , 89 } ;
        int sum = 0 ;
        for ( int i = 0; i < myAhmea.length; ++i )
            sum = sum + myAhmea [i] ;
        double average = (double) sum / myAhmea.length ;
        System.out.println(sum);
        System.out.println("the average is ;"  + (double) sum/myAhmea.length) ;
    }
}
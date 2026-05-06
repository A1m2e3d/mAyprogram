package week_7AStudentGrades;

import java.util.ArrayList;
public class myprogram {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(87);
        grades.add(89);
        grades.add(66);
        grades.add(91);
        grades.add(10);
        grades.add(87);

        System.out.println(grades);
        grades.set(1, 100);
        System.out.println(grades);
        grades.remove(5);
        System.out.println(grades);

        if (grades.contains(10)) {
            System.out.println("grade(10) exists");
        } else {
            System.out.println("grades not found");
        }
    }
}

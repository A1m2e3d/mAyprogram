
public class Employee {
    String name;
   private double salary ;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
public double getsalary() {
    return salary ;
}

public void displayinfo( boolean details) {
    if (details){
    System.out.println("details");
}

}
}
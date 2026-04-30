 public class Developer extends Employee implements workable {
    String programmingLanguage;
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;

    }
    public void work(){
    System.out.println("work");
    }
 }

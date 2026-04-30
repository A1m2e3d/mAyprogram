public class manager extends Employee implements workable{
    int teamZize ;
    public manager(String name, double salary, int teamZize) {
        super( name, salary,teamZize);
        this.teamZize = teamZize;
    }
    @Override
    public void work() {
    System.out.println("work");
    }
}


package ss2_constructor_access_modifier.access_modifier;

public class Animal {
    private int id;
    String name; // default
    protected String gender;
    public double weight;

    void output() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.weight);
    }
}

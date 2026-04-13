package ss2_constructor_access_modifier.access_modifier;

public class AnimalManagement {
    static void main() { // >= JDK 25
        Animal animal = new Animal();

//        System.out.println(animal.id);
        System.out.println(animal.name);
        System.out.println(animal.gender);
        System.out.println(animal.weight);
    }
}

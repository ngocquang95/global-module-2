package ss2_constructor_access_modifier.access_modifier.other;

import ss2_constructor_access_modifier.access_modifier.Animal;

public class Cat extends Animal {
    void output() {
//        System.out.println(this.id);
//        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.weight);
    }
}

package sg.npayment;

import java.util.function.Supplier;

public class InstanceRefrence {
    public static void main(String[] args) {
        Person person = new Person("John");
        Supplier<String> supplier = Person::getName;
        String name = supplier.get();
        System.out.println(name);
    }
    public static class Person {
        private static String name;

        public Person(String name) {
            this.name = name;
        }

        public static String getName() {
            return name;
        }
    }

}

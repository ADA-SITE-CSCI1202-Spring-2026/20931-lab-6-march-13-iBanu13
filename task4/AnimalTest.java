package task4;
public class AnimalTest {

    public static void main(String[] args) {

        Animal a1 = new Animal("Mastan", "Kayra", 3);
        Dog a2 = new Dog("Erman", "Banu", 5, "Doberman");
        Animal a3 = new Animal("Toplan", "Umay", 3);

        System.out.println("Animal 1: " + a1);
        System.out.println("Animal 2: " + a2);
        System.out.println("Animal 3: " + a3);

        System.out.println("a1 equals a2: " + a1.equals(a2));
        System.out.println("a1 equals a3: " + a1.equals(a3));

        System.out.println("Owner of a1: " + a1.getOwnerName());

        a1.setAge(4);
        System.out.println("Updated age of a1: " + a1.getAge());
    }
}

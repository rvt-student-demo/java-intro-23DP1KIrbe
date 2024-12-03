package lv.rvt;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return "dzīvnieks ir " + this.name;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");

        System.out.println(animal1);
        System.out.println(animal2.toString());
    }
}

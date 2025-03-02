package lv.rvt;

public class PersonVecs {
    private String name;
    private int age;
    private String group;
    private double weight;
    private double height;

    public PersonVecs(String name, int age, double weight,  double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public PersonVecs(Object object, Object object2, int i) {
        //TODO Auto-generated constructor stub
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup () {
        return this.group;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void growOlder() {
        if(this.age < 30) {
            this.age++;
        }
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    // public String toString() {
    //     return this.name+ ", " + this.age + ", " + this.weight + ", " + this.height;
    // }

    public String toCsvRow() {
        return this.name+ ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    // public static void main( String[] args) {
    //     Person ada = new Person("Ada");
    //     Person max = new Person("Max");

    //     max.printPerson();
    //     ada.printPerson();
    //     System.out.println("");

    //     max.growOlder();
    //     for (int i = 0; i < 35; i++) {
    //         ada.growOlder();
    //     }

    //     max.printPerson();
    //     ada.printPerson();
    //     System.out.println("");

    //     System.out.println(max.isOfLegalAge());
    //     if (ada.isOfLegalAge()) {
    //         System.out.println("Ada is 18 or older");
    //     }
    //     System.out.println("");

    //     max.setAge(100);
    //     System.out.println(max.getAge());
    //     System.out.println("");

    //     ada.setGroup("dp2-1");
    //     System.out.println(ada.getGroup());
    //     System.out.println("");

    //     max.setHeight(173);
    //     max.setWeight(69);
    //     System.out.println(max.bodyMassIndex());
    //     System.out.println("");

    //     System.out.println(max);
    // }
}
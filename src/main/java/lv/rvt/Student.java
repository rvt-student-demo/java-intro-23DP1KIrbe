package lv.rvt;

public class Student extends Personn {

    private int credits = 0;
    private String name;
    private String street;

    public Student(String name, String street) {
        super(name, street);
        this.name = name;
        this.street = street;
    }

    public void credits(int credits) {
        this.credits = credits;
    }

    public int credits() {
        return this.credits;
    }

    public void study(){
        this.credits += 1;
    }

    
    public String toString() {
        return this.name + "\n " + this.street + "\n " + this.credits;
    }
}

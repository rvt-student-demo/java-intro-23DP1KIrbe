package lv.rvt;

public class Student extends Personn {

    private int credits = 0;

    public Student(String name, String street) {
        super(name, street);
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
}

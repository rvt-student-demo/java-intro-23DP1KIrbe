package lv.rvt;

public class Personn {

    private String name;
    private String street;
    private int salary;

    public Personn(String name, String street, int salary){
        this.name = name;
        this.street = street;
        this.salary = salary;
    }

    public Personn(String name, String street){
        this.name = name;
        this.street = street;
    }

    public String toString() {
        return this.name + "\n " + this.street + "\n salary " + this.salary + " euro/month";
    }
}

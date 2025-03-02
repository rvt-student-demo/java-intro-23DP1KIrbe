package lv.rvt;

public class Personn {

    private String name;
    private String street;

    public Personn(String name, String street){
        this.name = name;
        this.street = street;
    }

    public String toString() {
        return this.name + "\n" + this.street;
    }
}

package lv.rvt;
import java.util.*;

public class forEachLoop {
    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        for (String teacher: teachers) {
            System.out.println(teacher);
        }
    }
}

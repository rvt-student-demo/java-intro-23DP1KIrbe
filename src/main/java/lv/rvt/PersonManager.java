package lv.rvt;
import java.io.BufferedReader;
import java.util.ArrayList; 

import lv.rvt.Helper;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception{

        ArrayList<Person> persons = new ArrayList<>();
        BufferedReader reader = Helper.getReader("Persons.csv");

        reader.readLine();
        String line;
        Person person1 = new Person("Maija", 5, 124, 135);

        while((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            Person person = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persons.add(person);
            
        }

        persons.add(person1);
        return persons;
    }
}
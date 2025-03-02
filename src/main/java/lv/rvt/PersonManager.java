package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList; 

import lv.rvt.Helper;

public class PersonManager {
    public static ArrayList<PersonVecs> getPersonList() throws Exception{

        ArrayList<PersonVecs> persons = new ArrayList<>();
        BufferedReader reader = Helper.getReader("Persons.csv");

        reader.readLine();
        String line;
        

        while((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            PersonVecs person = new PersonVecs(parts[0], Integer.valueOf(parts[1]), Double.valueOf(parts[2]), Double.valueOf(parts[3]));
            persons.add(person);
        }
        return persons;
    }

    public static void addPerson (PersonVecs person) throws Exception {
        BufferedWriter writer = Helper.getWriter("Persons.csv", StandardOpenOption.APPEND);

        writer.write(person.toCsvRow());
        writer.newLine();

        writer.close();
    }
}
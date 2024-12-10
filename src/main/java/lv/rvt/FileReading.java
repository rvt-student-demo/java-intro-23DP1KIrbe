package lv.rvt;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileReading {
    
    public static void main(String[] arga) throws Exception {
        
        ArrayList<Person> persons = new ArrayList<>();
        
        BufferedReader reader = Helper.getReader("persons.csv");
    
        String line;
        
        

       

        // izlasīt persons.csv failu un aizpildit persons masivu ar person classes objektiem

        // ar for each ciklu printet arralist masiva elemntus

        
        reader.readLine();

        while ((line = reader.readLine()) != null) {


            String[] parts = line.split(", ");
            

            Person person1 = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persons.add(person1);

            
            // Izveido person objektu un ievieto
            // arraylist masiva seit

        }

        for (Person person1 : persons){
            System.out.println(person1);
        }

        reader.close();
        
        
    }
}

package lv.rvt;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class App 
{
    public static void printPersons(ArrayList<Person> persons){
        // [new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200)]
        // [new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028")]
        Person ada = persons.get(0);
        Person ollie = persons.get(1);

        System.out.println(ada);
        System.out.println(ollie);
    }


    public static void main( String[] args ) throws Exception {
        


        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
        
        
        
        
        // Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        // Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        // System.out.println(ada);
        // System.out.println(esko);

        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        // int i = 0;
        // while (i < 25) {
        //     ollie.study();
        //     i = i + 1;
        // }
        // System.out.println(ollie);
        
        
        
        
        // Personn ada = new Personn("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        // Personn esko = new Personn("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        // System.out.println(ada);
        // System.out.println(esko);
        
        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // System.out.println(ollie);
        // System.out.println("Study credits " + ollie.credits());
        // ollie.study();
        // System.out.println("Study credits "+ ollie.credits());
        
        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // System.out.println(ollie);
        // ollie.study();
        // System.out.println(ollie);
        
        
        
        
        
        // Superclass sup = new Superclass();
        // Subclass sub = new Subclass();
        
        // System.out.println(sup);
        // System.out.println(sub);

        
        // izveidojam iespeju programmas lietotajam iedavit personas datus un saglabat csv faila ar ieprieks izveidoto metodi
        // Scanner scanner = new Scanner(System.in);
        // boolean isProgramRunning = true;
        // ArrayList<Person> persons = new ArrayList<>();
        // System.out.println("Izvelies komandu");
        // System.out.println("show");
        // System.out.println("add");
        // System.out.println("help");
        // System.out.println("exit");
        

        // while(isProgramRunning) {
        //     String command = scanner.nextLine();

        //     if(command.equals("exit")){
        //         System.out.println("Bye bye");
        //         isProgramRunning = false;
        //     } else if (command.equals("show")){
        //         persons = PersonManager.getPersonList();
        //         for(Person person : persons){
        //             System.out.printf("%10s | %3d | %6.2f | %6.2f | %8.2f |\n", person.getName(), person.getAge(), person.getWeight(), person.getHeight(), person.bodyMassIndex());

        //         }
        //     } else if (command.equals("add")){
        //         System.out.println("Ievadiet vārdu:");
        //         String name = scanner.nextLine();
        //         System.out.println("Ievadiet vecumu:");
        //         int age = Integer.valueOf(scanner.nextLine());
        //         System.out.println("Ievadiet svaru:");
        //         double weight = Double.valueOf(scanner.nextLine());
        //         System.out.println("Ievadiet augumu: ");
        //         double height = Double.valueOf(scanner.nextLine());

        //         Person person =  new Person(name, age, weight, height);
        //         PersonManager.addPerson(person);
        //     } else if (command.equals("help")){
        //         System.out.println("Iespejamās komandas");
        //         System.out.println("show");
        //         System.out.println("add");
        //         System.out.println("help");
        //         System.out.println("exit");
        //     }

        //     System.out.println();
        // }
        
        
        
        // while(userCommand.equals("exit") == false) {
        //     if (userCommand.equals("show")) {
        //         System.out.println("Show persons");
        //     } else if (userCommand.equals("add")) {
        //         System.out.println("adding");
        //     }
        // }

       
    }
    // public static void modify(Persoln person){
    //     Person.setName("Modified!");
    // }
}
package lv.rvt;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class App 
{
    

    public static void main( String[] args ) throws Exception {
        
        BufferedWriter writer = Helper.getWriter("Persons.csv", StandardOpenOption.APPEND);
        
        writer.write("Jack, 20, 167, 50");
        writer.newLine();
        writer.close();

        System.out.println("Program end");


       
    }
    // public static void modify(Persoln person){
    //     Person.setName("Modified!");
    // }
}
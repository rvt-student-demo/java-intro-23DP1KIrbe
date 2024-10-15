package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        
        ArrayList<String> name = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        String aa = "1";
        while(aa != ""){
            String bb = scanner.nextLine();
            if(bb.equals("")){
                aa = "";
            }
            name.add(bb);
        }
        System.out.println(name.get(2));

        

        scanner.close();
    }
}
package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int pirmais = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int otrais = Integer.valueOf(scanner.nextLine());

        if (pirmais > otrais) {
            System.out.println("Greater number is:" + pirmais);
        } else {
            System.out.println("Greater number is:" + otrais);
        }
        scanner.close();
    }

}

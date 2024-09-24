package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
         int summa = 0;
         int count = 0;

        
        while(true) {
            System.out.println("Enter the number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            summa += number;
            count++;
            

        }
        System.out.println("Number of numbers:" + count);
        System.out.println("Sum of numbers:" + summa);
        scanner.close();
    }

}

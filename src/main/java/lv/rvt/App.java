package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(2, 10);
        scanner.close();
    }
    
    public static void divisibleByThreeInRange(int num1, int num2){
        for(int i = num1; i<=num2; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    } 
}
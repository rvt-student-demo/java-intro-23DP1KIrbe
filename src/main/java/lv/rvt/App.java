package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }

}

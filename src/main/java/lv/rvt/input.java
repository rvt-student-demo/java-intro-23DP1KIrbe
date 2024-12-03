package lv.rvt;

import java.util.Scanner;

public class input {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int skaitlis = Integer.valueOf(scanner.nextLine());
        double decimalSkaitlis = Double.valueOf(scanner.nextLine());
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println(input);
        System.out.println(skaitlis);
        System.out.println(decimalSkaitlis);
        System.out.println(bool);
    }
}

package lv.rvt;

import java.util.Scanner;

public class numberActions {
    
    public static void main(String[] args) {
        System.out.println("Summa" + 1 + 2);
        System.out.println("Summa" + (1+2));

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int number3 = Integer.valueOf(scanner.nextLine());

        int sum = number1 + number2 + number3;
        int mult = number1 * number2 * number3;

        System.out.println("Summa = " + sum);
        System.out.println("Reizinājums = " + mult );
        System.out.println("Vidējais = " + sum / 3);

        int calculationWithParentheses = (1+1) + 3 * (2+5);
        System.out.println(calculationWithParentheses);

        int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        System.out.println(calculationWithoutParentheses);

        int first = 2;
        int second = 3;

        double result = (double) first / second;
        System.out.println(result);
    }
}

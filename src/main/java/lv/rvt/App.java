package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        int number;
        System.out.println("Enter numbers (enter -1 to break): ");
        while(true){

            number = scanner.nextInt();
            list.add(number);
            if (number == -1) {
                break;
            }
        }

        int nn = 0;
        int ff = 0;

        while(true){
            System.out.println("From where" );
            nn = scanner.nextInt();
            if(nn < 0){
                System.out.println("Not valid number");
            }else{
                break;
            }
        }
        while(true){
            System.out.println("To where: ");
            ff = scanner.nextInt();
            if(ff < list.size()){
                System.out.println("Not valid number");
            }else{
                break;
            }
        }
        for(int i = nn; i <= ff; i++){
            System.out.println(list.get(i));
        }
        scanner.close();
    }
}
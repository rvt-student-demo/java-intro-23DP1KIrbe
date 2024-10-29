package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        // ArrayList<Integer> list = new ArrayList<>();
        // int number;
        // System.out.println("Enter numbers (enter -1 to break): ");
        // while(true){

        //     number = scanner.nextInt();
        //     list.add(number);
        //     if (number == -1) {
        //         break;
        //     }
        // }

        // int nn = 0;
        // int ff = 0;

        // while(true){
        //     System.out.println("From where" );
        //     nn = scanner.nextInt();
        //     if(nn < 0){
        //         System.out.println("Not valid number");
        //     }else{
        //         break;
        //     }
        // }
        // while(true){
        //     System.out.println("To where: ");
        //     ff = scanner.nextInt();
        //     if(ff < list.size()){
        //         System.out.println("Not valid number");
        //     }else{
        //         break;
        //     }
        // }
        // for(int i = nn; i <= ff; i++){
        //     System.out.println(list.get(i));
        // }

        
        
        
        
        Integer capa = Integer.valueOf(scanner.nextLine());
        Integer gage = Integer.valueOf(scanner.nextLine());
        Integer miles = Integer.valueOf(scanner.nextLine());
        

        System.out.println("Tank capacity:");
        System.out.println(capa);
        System.out.println("Gage reading:");
        System.out.println(gage);
        System.out.println("Miles per gallon:");
        System.out.println(miles);

        if(gage == 50 || gage == 100){
            int extra = 0;
            if(gage == 100){
                extra = 1;
            }
            if(gage == 50){
                extra = 2;
            }
            
            int result = capa / extra;
            if(result * miles > 200){
                System.out.println("Safe to proceed");
            }else{
                System.out.println("Get gas!");
            }
        }
        
        if(gage == 75 || gage == 25){
            int result2 = 0;
            if(gage == 75){
                result2 = capa / 4 * 3;
            }
            if(gage == 25){
                result2 = capa / 4;
            }
            if(result2 * miles > 200){
                System.out.println("Safe to proceed");
            }else{
                System.out.println("Get gas!");
            }
        }
        
        scanner.close();
    }
}
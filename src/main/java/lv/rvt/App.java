package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        //print stars
        printStars(5);
        printStars(3);
        printStars(9);

        //print square

        printSquare(4);

        //print triangle

        printTriangle(4);
        System.out.println();

        //print spaces
        printTriangleTwo(4);
        System.out.println();

        //print christamstree
        printChristamsTree(4);
        
        printChristamsTree(10);
    }
    
    public static void printStars(int number){
        for(int i = 0; i<number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void printSquare(int size){
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    
    public static void printTriangle(int height){
        for(int i = 1; i<=height; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSpaces(int number){
        for(int i = 0; i<number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangleTwo(int size){
        for(int i = 1; i<=size; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void printChristamsTree(int height){
        for(int i = 1; i<=height; i++){
            printSpaces(height - i);
            printStars(2 * i - 1);
        
        }
        printSpaces(height-2);
        System.out.println("***");
        printSpaces(height-2);
        System.out.println("***");
    }
}
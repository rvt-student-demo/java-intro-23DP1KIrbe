package lv.rvt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayVsArrayList {
     public static void main(String[] args) {

        // String[] friendsArray = new String[4]
        // String[] friendsArray2 = {"Adrian", "Dima", "Kristap", "Artem"}

        // ArrayList<String> friendArrayList = new ArrayList<>();
        // ArratList<String> friendArrayList2 = new ArrayList<>(Arrays.asList("Adrian", "Dima", "Kristap", "Artem"));

        // System.out.println(friendsArray2[3]);
        // System.out.println(friendArrayList2(3));

        // System.out.println(friendsArray2.length);
        // System.out.println(friendArrayList2.size());

        // friendArrayList2.add("a");
        // System.out.println(friendArrayList2.size);

        // System.out.println(friendArrayList2.get(2));
        // friendArrayList2.remove(2);
        // System.out.println(friendArrayList2.get(2));
        // System.out.println(friendArrayList2.get(3));
        // System.out.println();

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String word = scanner.nextLine();
            if (word == "") {
                break;
            }
            else {
                list.add(word);
            }
        }
        System.out.println(list.get(2));


        ArrayList<Integer> intList = new ArrayList<>();

        int sum = 0;
        while(true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            else {
                intList.add(num);
                sum += num;
            }
        }
        System.out.println(sum);
     }
}

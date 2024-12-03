package lv.rvt;

public class variable {
    
    public static void main(String[] args) {
        String text = "contains text";
        int wholeNumber = 21;
        double floatingPoint = 123.123;
        boolean trueOrFalse = true;

        System.out.println("text variable: " + text);
        System.out.println("integer variable: " + wholeNumber);
        System.out.println("floating-point variable: " + floatingPoint);
        System.out.println("boolean: " + trueOrFalse);

        int value = 10;
        value = 4;
        System.out.println(value);

        boolean assignment = false;

        double floatingPoint2 = 0.42;
        floatingPoint2 = 1;
        floatingPoint2 = value;
    }
}

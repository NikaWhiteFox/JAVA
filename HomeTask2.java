/**
 * Java 1. Homework 2
 * 
 * @author Veronika
 * @version 21.04.2023
 */

class HomeTask2 {
    public static void main(String[] args) {
        checkSumBetween10And20(5, 10);
        determineNumberPositive(10);
        determineNumberNegative(-8);
        repeatText("Hello! ", 7);
        determineLeapYear(1000);
    }
    
    static boolean checkSumBetween10And20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void determineNumberPositive(int a) {
        System.out.println(a >= 0 ? "Number is positive." : "Number is negative.");
    }
    
    static boolean determineNumberNegative(int a) {
        return a <= 0;
    }
    
    static void repeatText(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }
    
    static boolean determineLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        }
}
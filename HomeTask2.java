/**
 * Java 1. Homework 2
 * 
 * @author Veronika
 * @version 21.04.2023
 */

class HomeTask2 {
    public static void main(String[] args) {
        System.out.println(checkSumBetween10And20(5, 10) ? "Summ is between 10 and 20 - true." : "Summ is between 10 and 20 - false.");
        System.out.println(determineNumberPositive(10)? "Number is positive." : "Number is negative.");
        System.out.println(determineNumberNegative(-8)? "Number is negative - true." : "Number is negative - false.");
        repeatText("Hello! ", 7);
        determineLeapYear();
    }
    
    static boolean checkSumBetween10And20(int a, int b) {
		return a + b >= 10 && a + b <= 20;
    }
    
    static boolean determineNumberPositive(int a) {
        return a >= 0;
    }
    
    static boolean determineNumberNegative(int a) {
        return a <= 0;
    }
    
    static void repeatText(String text, int a) {
        for (int i = 0; i < a; i++) {
        System.out.print(text);
        }
    System.out.println();
    }
    
    static void determineLeapYear() {
		int year = 1000;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year - true.");
        } else {
            System.out.println("Leap year - false.");
        }
    }
}
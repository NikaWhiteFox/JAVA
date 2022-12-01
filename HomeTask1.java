class HomeTask1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
	}
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 3;
        int b = -4;
        int s = a + b;
        System.out.println(s >= 0? "Sum is positive": "Sum is negative");
    }
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 16;
        System.out.println(a >= b? "a >= b": "a < b");
    }
}
class Color {
    public static void main(String[] args) {
	    printColor();
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
}
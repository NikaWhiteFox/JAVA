class HelloWorld {
    // fields
    // methods
    public static void main(String[] args) {
		int t = 24;
		int a = 2;
		a *= a;
		//if (t > 35) {
		//	System.out.println("Too hot");
		//} else {
		//	System.out.println("Normal");
		//}
		printHi();
		System.out.println(t/a > 6? "Too hot": "Normal" + " " + a + " " + t + " " + t/a);
		
    }
	public static void printHi() {
		System.out.println("Hi!");
	}
}
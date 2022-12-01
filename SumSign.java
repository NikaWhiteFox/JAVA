class SumSign {
	public static void main(String[] args) {
		checkSumSign();
    }
    public static void checkSumSign() {
		int a = 3;
		int b = -4;
		int s = a + b;
		System.out.println(s >= 0? "Sum is positive": "Sum is negative");
	}
}
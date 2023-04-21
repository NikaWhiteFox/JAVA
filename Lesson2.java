import java.util.Arrays;

class Lesson2 {
    public static void main(String[] args) {
        int[] arr = new int [6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.println(i + " " + arr [i]);
        }
        System.out.println(Arrays.toString(arr));
        {
        int i = 5;
        while (i < 10) {
            i = i + 1;
            System.out.println(i);
		}
        }
    }
}
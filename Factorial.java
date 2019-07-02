public class Factorial {
    public static void main(String[] args) {
        int[] arrays = new int[11];                             // created arrays
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {               // appropriated value to each elements
            arrays[i] = i + 10;
            sum = arrays[i] + sum;
        }
        System.out.println(sum / arrays.length);
    }
}
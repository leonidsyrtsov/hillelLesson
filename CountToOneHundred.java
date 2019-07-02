public class CountToOneHundred {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {               // cycle with conditional operator
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.print("HelloWorld" + " ");
            } else if (i % 5 == 0) {
                System.out.print("World!" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Hello" + " ");
            } else {
                System.out.print(i + " ");
            }

        }
    }
}
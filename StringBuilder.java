public class StringBuilder {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            StringBuilder result = new StringBuilder();
            result.append("(").append(i).append(")");
            System.out.print(result.toString());                     
        }
    }
}

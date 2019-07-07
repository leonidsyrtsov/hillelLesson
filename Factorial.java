public class Factorial {
    public static void main(String[] args){
        int[] arrays = new int[10];                             
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {              
            arrays[i] = random.nextInt(11) + 10;
            sum += arrays[i];
        }
        System.out.println(sum / arrays.length);
    }
}

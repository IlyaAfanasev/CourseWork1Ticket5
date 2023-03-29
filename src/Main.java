import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]+=1;
            }
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 2; i <7 ; i++) {
            System.out.println(numbers[i]);

        }
        int [] numbersCopy= Arrays.copyOfRange(numbers,2,7);
        System.out.println(Arrays.toString(numbersCopy));
    }
}
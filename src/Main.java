import java.util.Arrays;

public class Main {
    public static int [] numbersChange(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                numbers[i]+=1;
            }
        }
        return Arrays.copyOfRange(numbers,2,7);
    }
    public static void main(String[] args) {
        int [] numbers=numbersChange(new int[] {1,2,3,4,5,6,7,8,9,10}) ;

        System.out.println(Arrays.toString(numbers));
    }
}
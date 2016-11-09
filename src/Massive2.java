import java.util.Arrays;
import java.util.Random;

public class Massive2 {
    public static void main (String[]args){
        int numbers[] = new int[12];
        int min = numbers[0];
        int index = 0;

        Random randomGanerator = new Random();
        for (int i = 0; i < numbers.length; i++){
            int randomInt = randomGanerator.nextInt(8) - 15;
            numbers[i] = randomInt;

        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] > min) {
                min = numbers[i];
                index = i;
            }
        }
        System.out.println("Max number is " + "(" + min + ")" + " with index - " + "(" + index + ")");
    }
}

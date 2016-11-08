import java.util.Arrays;
import java.util.Random;

public class Massive2 {
    public static void main (String[]args){
        int numbers[] = new int[12];
        int max = numbers[0];
        int index = 0;

        Random randomGanerator = new Random();
        for (int i = 0; i < numbers.length; i++){
            int randomInt = randomGanerator.nextInt(30) - 15;
            numbers[i] = randomInt;

        }
        System.out.println(Arrays.toString(numbers));


        for (int i = 0; i < numbers.length; i++){
            if (max > numbers[i]){
                System.out.println("You have only negative nambers!!!");
                break;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Max number - " + "(" + max + ")" + " with index - " + index);
    }
}

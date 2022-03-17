import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args){
        int min = 0;
        int max = 0;

        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum > 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
            if (temp > max){
                max = temp;
                System.out.println(max);
            }
            if (temp < min){
                min = temp;
                System.out.println(min);
            }
        }

    }
    }

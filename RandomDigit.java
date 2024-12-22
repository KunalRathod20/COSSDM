import java.util.Random;

public class RandomDigit {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int result = random.nextInt(9000) + 1000;
            System.out.println(result);
        }
    }
}

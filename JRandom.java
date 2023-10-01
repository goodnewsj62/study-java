import java.util.Random;
import java.util.UUID;

public class JRandom {
    public static void main(String[] args) {
        Random randomGen =  new Random();
        int random63BitLong =  randomGen.nextInt();

        System.out.println(random63BitLong);
        System.out.println(UUID.randomUUID());
    }
}

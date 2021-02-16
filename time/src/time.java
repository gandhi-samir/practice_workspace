import javax.swing.text.MutableAttributeSet;
import java.util.Random;

public class time {
    public static void main(String[]args) throws InterruptedException {
        int x = 0;
        while (x < 1){
        double randomNumber = Math.random();
        double d = randomNumber*10000000;
        int randomInt = (int)d+10000000;
            Thread.sleep(randomInt);
            System.out.println("hi");

        }
    }
}

import java.util.Scanner;

public class eulerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value");
        double n = input.nextInt();
        double stepSize = 1 / n;
        System.out.println("Step Size: "+stepSize);
        double yNMinusOne = 0;
        double yN;
        double x = 0;

        while (x < 1) {
            //y(n)=(yn-1+((dy/dx)*stepsize))
            // re wrote equation in easier from to code
            yN = (yNMinusOne + ((0.5*(2-x) * (Math.sqrt(1 - x))) * stepSize));
            //becomes y(n) becomes y(n-1) then gets used in the formula as y(n-1) for next y value
            yNMinusOne = yN;
            //x0 becomes x1 by increasing step size
            x+= stepSize;
        }
        System.out.println("y(1)= "+yNMinusOne);
    }
}

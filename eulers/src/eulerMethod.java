import java.util.Scanner;

public class eulerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value");
        double n = input.nextInt();
        double stepSize = 1 / n;
        System.out.println("Step Size: "+stepSize);
        double yNMinusOne = 0;

        double xN = 0;
        double xNMinus1=0;
        // no need to increase step size since only using x and y is not used
        //

        for(int i =0; i < n;i++) {//loops through n times
           xN=xNMinus1+(0.5*(2-xNMinus1)*Math.pow((1-xNMinus1),0.5)*stepSize);// cahnges value of xN in every iteration based on step size changing xNMinus1
           xNMinus1=xN;// sets the value of xN to xNMinus1 for use in next iteration since formula is xn=xn-1...


        }
        System.out.println("y(1)= "+xN);//print out value after loop iterations
    }
}

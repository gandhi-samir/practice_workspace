package console_apps;



import model.function;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        System.out.println("Enter N number of Trapezoids");
        Scanner input = new Scanner(System.in);
        double nValue = input.nextDouble();
        double integral = function.f(nValue);
        System.out.println(integral);






    }
}
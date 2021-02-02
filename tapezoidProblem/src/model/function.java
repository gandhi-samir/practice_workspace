package model;

import java.lang.*;
public class function {
    public static double f(double f) {
        double value = 0;
        //x = 1
        double startingBase = Math.exp(1);
        //1/x x = 2 ... 1/2
        double endBase = Math.exp(0.5);
        double insideBase = 0;
        //b -a / 2*n for area of trapezoid
        double trapezoid = (2 - 1) / (2 * f);

        if (f == 1.0){
            value = (startingBase + endBase) * trapezoid;
        }

        else {
            for (double i = 1; i < f; i++) {
                double exponent = (1 / (1 + (i / f)));
                // inside base of trapezoid * 2 since  the the two sides connect and are same height
                double insideValue = Math.exp(exponent) * 2;

                insideBase = insideBase + insideValue;
            }
            // takes beginning base of trapezoid plus all the interior bases + end base multiply by (1/2)*height which = 1/2*height(base = area of trapezoid
            value = (insideBase + startingBase + endBase) * trapezoid;
        }
        return value;
    }
}



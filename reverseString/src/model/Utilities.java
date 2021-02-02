package model;

public class Utilities {
    public static String stringReverse(String sentence) {
        String result = "";
        String [] cars = sentence.split("\\s");



        for (int i = cars.length-1; i >=0;i--) {
            if (i == 0) {
                result += cars[i];
            } else {
                result += cars[i] + " ";
            }
        }
        result=result.trim();
        return result;
    }
}

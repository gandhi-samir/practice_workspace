package model;

public class Utilities {
    public static String stringReverse(int []arry) {
        String result = "";
        int [] temp = new int[arry.length];

        for(int i = arry.length-1;i>=0;i--){
            for (int j = 0; j< arry.length;j++){
                temp[j]=arry[i];
            }
        }

            result=""+temp[1]+" "+temp[2];




        return result;

    }
}

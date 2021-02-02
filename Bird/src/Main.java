import java.util.Scanner;

    public class Main {
    public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   int radius = input.nextInt();

   input.close();
    boolean isPositive = radius > 0 ;
    if (!isPositive ){
        System.out.println("falseeee"+ isPositive);
    }
   else{
        System.out.println("yessssirski");
    }

    }


    }




public class q {

public static void main(String [] args){
    int [] a ={3,1,2,9,2};



    System.out.println("");
    insertionSort(a,5);
}
 public static void selectionSort(int[] a, int n){
    for(int i =0; i <=(n-2);i++){
        int minIndex=i;
        for(int j=i;j<=(n-1);j++) {
            if (a[j] < a[minIndex]) {
                minIndex = j;
            }
        }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
            System.out.print(a[0]);
            System.out.print(a[1]);
            System.out.print(a[2]);
            System.out.print(a[3]);
        System.out.print(a[4]);
            System.out.println("");

    }
}

public static void insertionSort(int [] a, int n){
    //31929
    for(int i =1;i<n;i++){
        int current=a[i];
        int j =i;
        while(j>0 && a[j-1]>current){

            a[j]=a[j-1];
            j--;
            System.out.print(a[0]);
            System.out.print(a[1]);
            System.out.print(a[2]);
            System.out.print(a[3]);
            System.out.print(a[4]);
            System.out.println("");
        }
        a[j]=current;
        System.out.print(a[0]);
        System.out.print(a[1]);
        System.out.print(a[2]);
        System.out.print(a[3]);
        System.out.print(a[4]);
        System.out.println(" " +i);
        System.out.println("");
    }
}
}
//12239 j =3
//current = 2
//j=3
//3>0
//9>2
//9<-->2
//1329
//j=2
//
//











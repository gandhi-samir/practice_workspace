public class binarySearchExample {

        public static void binarySearch(int sorted[], int from, int to, int key) {
            if(from > to){
                System.out.println("false");
            }
            else if(from == to){
                System.out.println(sorted[from]==key);
            }
            else{
                int middle = (from + to)/2;
                int middleValue = sorted[middle];
                if(key < middleValue){
                    binarySearch(sorted,from,middle-1,key);
                }
                else if(key > middleValue){
                    binarySearch(sorted,middle+1,to,key);
                }
                else{
                    System.out.println("true"+middle);
                }
            }
        }

        public static void main(String args[]) {
            int arr[] = {1, 2, 5, 8, 9, 13};
            int key = 9;
            int last = arr.length - 1;
            binarySearch(arr, 0, last, key);
        }
    }





// import java.util.*;
//  class sorting{
//     public static void bubblesort(int arr[]){
//         for(int i=0; i<=arr.length-1; i++){
//             for(int j=0; j<arr.length-i-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
        
//     }
//     public  static void printarr(int arr[]){
//             for(int k=0; k<arr.length; k++){
//             System.out.print(arr[k] +" ");
//         }
//         System.out.println();
//     }

//    public  static void selectionsort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minpos = i;
//             // search smallest number of possition to given example
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[minpos]>arr[j]){
//                     minpos=j;
//                 }
//             }
//             // swap
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;


//         }
//     }
//     public static void insertionsort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int curr = arr[i];
//             int prev = i-1;
//             // finding correct possition 
//             while(prev>=0 && arr[prev]>curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             // insertion
//             arr[prev+1] = curr;

//         }
//     }
//     public static void main (String args[]){
//        int arr[] = {5,4,1,3,2};
//     //    bubblesort(arr);
//     // selectionsort(arr);
//     insertionsort(arr);
//        printarr(arr);

//     }
// }


// import java.util.*;
// public class sorting{
//     public static int [] bubblesort(int arr[]){
//         int swap=0;
//         for(int i=0; i<=arr.length-1; i++){
//             for(int j=0; j<arr.length-i-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap++;

//                 }
//             }
//         }
//         if(swap==0){
//             return arr[]

//     }
//      public static void printarr(int arr[]){
//             for(int k=0; k<=arr.length; k++){
//             System.out.print(arr[k] +" ");
//         }
//         System.out.println();
//     }
//     public static void main (String args[]){
//        int arr[] = {1,2,3,4,5};
//        bubblesort(arr);
//        printarr(arr);
//     }
// }


// java inbuiltfunction
import java.util.Arrays;
 class sorting {
     public static void printarr(int arr[]){
            for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] +" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        printarr(arr);
    }
}
import java.util.*;
// public class Recursion {
//     public static void printDec(int n){
//         if(n == 1){
//             System.out.print(n);
//             return;
//         }
//         System.out.print(n+" ");
//         printDec(n-1);

//     }
//     public static void printInc(int n ){
//         if (n == 1){
//             System.out.print(n+" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n+" ");

//     }
//     public static int fact(int n){
//         if(n == 0){
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n*fact(n-1);                             //note there is n is multiply by fact(n-1) not fmn1
//         return fn;
//     }
//     public static int sumnat(int n){
//         if(n == 1){
//             return 1;
//         }
//          int sumNM1 = sumnat(n-1);
//          int sumn = n + sumnat(n-1);
//          return sumn; 
//     }
//     public static int fib(int n){
//         if(n == 0 || n == 1){
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn; 
//     }
//     public static boolean isSorted(int arr[],int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//        return isSorted(arr,i+1);

//     }
//     public static int firstOccurence(int arr[],int key,int i){
//         if(i == arr.length-1){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return firstOccurence(arr,key,i+1);
//     }
//     public static int power(int x,int n){
//         if( n == 0){
//             return 1;
//         }
//         // int xpnm1 = x * power(x,n-1);
//         // int xpn = x *power(x,n-1);
//         return x * power(x,n-1);
//     }
//     public static int optimizepower(int x,int n){
//         if(n == 0){
//             return 1;
//         }
//         // n=Even
//         // int halfpowersqr = optimizepower(x,n/2) * optimizepower(x,n/2);                   // this is not optomize code this is O(n)
//         int halfsqr = optimizepower(x,n/2);
//         int halfpowersqr = halfsqr * halfsqr;                                                // this is optimize code
//         // n=Odd
//         if(n%2 != 0){
//           halfpowersqr = x * halfpowersqr;
//         }
//          return halfpowersqr;
//     }
//     // Tiling problem
//     public static int Tilingproblem(int n){
//         // base case
//         if(n == 0|| n == 1){
//             return 1;
//         }
//         // kaam
//         // choice
//         // vertical choice
//         int fnm1 = Tilingproblem(n-1);

//         int fnm2 = Tilingproblem(n-2);
//         int totways = fnm1 +fnm2;
//         return totways;
//     }
//     // remove dublicate in a string
//     public static void deletDuplicate(String str,int idx, StringBuilder newstr, boolean map[]){
//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }

//         char currchar = str.charAt(idx);
//         if (map[currchar - 'a'] == true){
//             // duplicate
//             deletDuplicate(str, idx+1, newstr,map);
//         }
//             else{
//                 map[currchar -'a'] = true;
//                 deletDuplicate(str , idx+1, newstr.append(currchar),map);
//             }
//         }
//         public static int friendspairing(int n){
//             if(n==1 || n==2){
//                 return n;
//             }
//             // single 
//             int fnm1 = friendspairing(n-1);

//             // pair
//             int fnm2 = friendspairing(n-2);
//             int pairways = (n-1)* fnm2;
            
//             // totways
//             int totways = fnm1 + pairways;
//             return totways;
//         }
//         public static void binaryString(int n, int lastplace, String str){
//             if(n == 0){
//                 System.out.println(str);
//                 return;
//             }

//             // if(lastplace == 0){
//             //     binaryString(n-1,0,str+"0");
//             //     binaryString(n-1,1,str+"1");

//             // }
//             // else{
//             //     binaryString(n-1,0,str+"0");
//             // }
//             binaryString(n-1,0,str+"0");
//             if(lastplace == 0){
//                  binaryString(n-1,1,str+"1");
                
//             }
                        

//         }
    
//     public static void main (String args[]){
//         // int n = 5;
//         // printDec(n);
//         // printInc(n);
//         // fact(n);
//         // System.out.println(fact(n));
//         // System.out.println(sumnat(n));
//         // System.out.println(fib(n));
//         // int arr[] ={1,2,3,4};
//     //System.out.println(isSorted(arr,0));
//     // int arr[] = {8,3,6,9,5,10,2,5,3};
//     // System.out.println(firstOccurence(arr,5,0));
//     // System.out.println(power(2,10));
//     // int x =2;
//     // int n =10;
//     // System.out.println(power(2,10));
//     // System.out.println(Tilingproblem(4));
//     // String str = "appnnacollege";
//     // deletDuplicate(str ,0, new StringBuilder("") ,new boolean[26]);
//     // System.out.println(friendspairing(5));
//     binaryString(3,0,"");



        
//     }
// }


// RECURSION OF MERGE SORT 
// public class Recursion {
//     public static void printarr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();

//     }
//     public static void mergsort( int arr[],int si,int ei){
//         if(si >= ei){
//             return;
//         }
//         int mid = si +(ei-si)/2;   //(si+ei)/2
//         mergsort(arr,si,mid);     //left part
//         mergsort(arr,mid+1,ei);   //right part
//         merge(arr,si,mid ,ei);
//     }
//     public static void merge(int arr[],int si,int mid,int ei){
//         //left(0,3)=4   right(4,6)=3 --> 6-0+1=7
//         int temp[] = new int[ei-si+1];
//         int i = si;    //iterator for left part
//         int j = mid+1;  //iterator for right part
//         int k = 0;       //iterator for temp

//         while(i<=j && j<=ei){
//             if(arr[i]<arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }
//             else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         // for left part
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         // for right part
//         while(j <= ei){
//             temp[k++] = arr[j++];
//         }
//         for(k=0, i=si; k<temp.length; k++, i++){
//             arr[i] = temp[k];

//         }
//     }
//     public static void main (String args[]){
//         int arr[] = {6,3,9,5,2,8};
//         mergsort(arr,0,arr.length-1);
//         printarr(arr);
//     }
// }


//RECURSION OF QUICK SHORT 
// public class Recursion{
//     public static void printarr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();
//     }
//     public static void Quicksort(int arr[],int si,int ei){
//         if( si >= ei){
//             return;
//         }
//         // it is recursion
//         int pIdx = partitian(arr,si,ei);
//         Quicksort(arr,si,pIdx-1);
//         Quicksort(arr,pIdx+1,ei);
//     }
//     public static int partitian(int arr[],int si, int ei){
//         int pvt = arr[ei];
//         int i = si-1;           // for making place which is smaller than pvt
//         for(int j=si; j<ei; j++){
//             if(arr[j]<pvt){
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//             //if loop is over increas j then also increas si not increas i (i increas on arr[j]<arr[i])
//         }
//         i++;
//                 int temp = pvt;
//                 arr[ei] = arr[i];  // pvt = arr[i]--> nhi ker sakte hai
//                 arr[i] = temp;
//                 return i;
    
//         }
    

    
//     public static void main (String args[]){
//         int arr[] = {6,3,9,8,2,5};
//         Quicksort(arr,0,arr.length-1);
//         printarr(arr);

//     }
// }


// SORTED & ROTED ARRAY SEARCH
// public class Recursion {
//     public static int search(int arr[], int key,int si,int ei){
//         //base case
//         if(si>=ei){
//             return -1;
//         }
//         int mid = (si+ei)/2;
//         if(key == arr[mid]){
//             return mid;
//         }

//         //now we check left side
//         if(arr[si]<=arr[mid]){
//             if(arr[si]<=key && key<=arr[mid]){
//                return search(arr,key,si,mid-1);
//             }
//             else{
//                 return search(arr,key,mid+1,ei);
//             }
//         }
//         else{
//             if(arr[mid]<=key && key<=arr[ei]){
//                return search(arr,key,mid+1,ei);

//             }
//             else{
//                 return search(arr,key,si,mid-1);
//             }
//         }    
//     }
    

    

// public static void main(String args[]){
//     int arr[] = { 4,5,6,7,0,1,2};
//     int target = 0;
//     search(arr,target,0,arr.length-1);
//     int result =search(arr,target,0,arr.length-1);
//     System.out.println(result);




// }
// }


// GIVEN NUMBER CONVERT INTO STRING OF ENGLISH
public class DSA {

}

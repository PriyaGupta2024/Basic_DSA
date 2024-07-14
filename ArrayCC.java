// import java.util.*;
// public class ArrayCC {
//     public static void main (String args[]){
//         int  marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//             marks[0] = sc.nextInt();
//             marks[1] = sc.nextInt();
//             marks[2] = sc.nextInt();
//             System.out.println("phy: " + marks[0]);
//             System.out.println("chem: " + marks[1]);
//             System.out.println("math: " + marks[2]);

//             marks[2]=100;
//             System.out.println("math: " + marks[2]);

//             int percentage = (marks[0]+marks[1]+marks[2])/3;
//             System.out.println("percentage: " + percentage);
//         }
    
// }


// array as function
// import java.util.*;
// public class ArrayCC {
//     public static void update(int marks[]){
    
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main (String args[]) {
//         int marks[] = {97,98,99};
        
//         update(marks);
        

//         for(int i=0; i<=marks.length; i++){
//             System.out.println("marks: " +marks[i]+" ");
            
//         }
//         System.out.println();
//     }
// }

// linear search
// import java.util.*;
// public class ArrayCC{
//     public static int linearSearch(int number[],int key ){
//         for(int i=0; i<number.length; i++){
//             if(number[i] == key){
//                   return i;
//         }
        
//         }
//               return -1;
//     }
   
//     public static void main (String args[]){
//         // int number[] = {10,20,5,8,65,12,45,28};
         
//         // int key = 65;
//         // int index =linearSearch(number,key);
//         // if(index==-1){
            
//         //     System.out.println("index not found");
//         // }
//         // else{
            
//         //     System.out.println("index of key is:"+index);
//         // }

// }

// import java.util.*;
// public class ArrayCC{
//     public static int getLargest(int number[]){
//          int Largest = Integer.MIN_VALUE;
//          int samallest = Integer.MAX_VALUE;
//          for(int i=0; i<number.length; i++ ){
//          if(Largest < number[i]){
//             Largest = number[i];

    
//          }
//          if(samallest>number[i]){
//             samallest=number[i];
//          }
//          }
//          System.out.println("the samallest vslue is:"+ samallest);

//          return Largest;
        

// }

// public static void main (String args[]){
//     int number[]= {1,8,2,9,5,4,};
//     System.out.println("the largest number in:"+  getLargest(number));


//}
//}

// import java.util.*;
// public class ArrayCC{
//    public static int binarySearch (int number[],int key){
//       int start=0; 
//       int end=number.length-1;
   
//       while(start<=end){
//          int mid=(start+end)/2;
//          if(number[mid]==key){
//             return mid;
//          }
//          if(number[mid] <key){     //right (2nd half)
//             start = mid+1;

//          }else{                  //left  (1st half)     
//             end = mid-1;
//          }
//             }
//             return -1;

//    }
   
   
//    public static void main(String args[]){
//       int number[]={2,3,4,5,6,9,12,14};
//       int key = 1;
//       System.out.println("index of key:"+ binarySearch(number,key));
//    }
//}

// REVERSE ARRAY
// import java.util.*;
// public class ArrayCC {
//    public static void reverseArray(int number[]){
//      int start = 0;
//      int end=number.length-1;
//      while(start<end){
//       // swap
//       int temp = number[end];
//       number[end] = number[start];
//       number[start] = temp;

//       start++;
//       end--;

//      }
//   }
//    public static void main(String args[]){
//       int number[] = {2,3,4,6,8,9,12,15};
//       reverseArray(number);
//       for(int i=0; i<number.length; i++){
//          System.out.print(number[i]+" ");

//       }
//       System.out.println();
//    }
   
   
// }



// PAIR IN ARRAY
// import java.util.*;
// public class ArrayCC{
//    public static void printpair(int number[]){
//       int tp=0;
//       for(int i=0; i<number.length; i++ ){
//        int curr = number[i];
//       for(int j=i+1; j<number.length; j++){
//          System.out.print("("+ curr +"," + number[j] +") ");
//          tp++;
//   }
//   System.out.println();
//    }
//    System.out.println("total number of pair:" +tp);
//  }
// public static void main (String args[]){
//    int number[] = {2,8,9,5,7,6,1};
//    printpair(number);

// }
// }

// PRINT SUBARRAY
// import java.util.*;
// public class ArrayCC{
//    public static void printsubarray(int number[]){
//       int ts=0;
//       for(int i=0; i<number.length; i++){
//         int start=i;
//          for(int j=i; j<number.length; j++){
//             int end=j;
//             for(int k=start; k<=end; k++){
//                System.out.print(number[k]+" ");
         
      
//             }
//             ts++;
//             System.out.println();   
//          }
//          System.out.println();
      
//       }
//       System.out.println("total number of subarray:"+ts);
//    }
//    public static void main(String args[]){
//       int number[] = {1,2,4,6,7,9};
//       printsubarray(number);


//    }
// }


// SUM OF SUBARRAY & MAXSUBARRAY   (BRUTE FORCE )
// import java.util.*;
// public class ArrayCC{
//    public static void printSumSubarray(int number[]){
//       int SumSubarray=0;
//       int maxsumSA=Integer.MIN_VALUE;
//       for(int i=0; i<number.length; i++){
//         int start=i;
//          for(int j=i; j<number.length; j++){
//             int end=j;
//             SumSubarray=0;
//             for(int k=start; k<=end; k++){

//                SumSubarray += number[k];
         
      
//             }  
//             System.out.println(SumSubarray);
//             if(maxsumSA<SumSubarray){
//                maxsumSA=SumSubarray;
//             }   
//          }
//       }
//       System.out.println("maximum sum of sum array:"+maxsumSA);
   
//    }
//    public static void main(String args[]){
//       int number[] = {1,-2,6,-1,3};
//       printSumSubarray(number);


//    }
// }


// OTHER  WAY TO SOLVE SUMSUBARRAY (USING PREFIX SUM)
// import java.util.*;
// public class ArrayCC{
//    public static void printSumSubarray(int number[]){
//       int SumSubarray=0;
//       int maxsumSA=Integer.MIN_VALUE;
//       int prefix[]=new int [number.length];
//       prefix[0]=number[0];

//       for(int i=1; i<number.length; i++){
//          prefix[i]=prefix[i-1]+number[i];
//       }
//       for(int i=0; i<number.length; i++){
//         int start=i;
//          for(int j=i; j<number.length; j++){
//             int end=j;
//             SumSubarray=0;
            

//                SumSubarray= start==0? prefix[end]: prefix[end]-prefix[start-1];
         
      
            
//             // System.out.println(SumSubarray);
//             if(maxsumSA<SumSubarray){
//                maxsumSA=SumSubarray;
//             }   
//          }
//       }
//       System.out.println("maximum sum of sum array:"+maxsumSA);
   
//    }
//    public static void main(String args[]){
//       int number[] = {1,-2,6,-1,3};
//       printSumSubarray(number);


//    }
// }


// SOME ANOTHER WAY TO SOLVE SUMSUBARRAY & MAXSUMSUBARRAY     (KADANE'S)
// import java.util.*;
// public class ArrayCC{
   // public static void printSumSubarray(int number[]){
   //    int SumSubarray=0;
   //    int maxsumSA=Integer.MIN_VALUE;
   //    int prefix[]=new int [number.length];
   //    prefix[0]=number[0];

   //    for(int i=1; i<number.length; i++){
   //       prefix[i]=prefix[i-1]+number[i];
   //    }
   //    for(int i=0; i<number.length; i++){
   //      int start=i;
   //       for(int j=i; j<number.length; j++){
   //          int end=j;
   //          SumSubarray=0;
            

   //             SumSubarray= start==0? prefix[end]: prefix[end]-prefix[start-1];
         
      
            
   //          // System.out.println(SumSubarray);
   //          if(maxsumSA<SumSubarray){
   //             maxsumSA=SumSubarray;
   //          }   
   //       }
   //    }
   //    System.out.println("maximum sum of sum array:"+maxsumSA);
   // }


//    public static void kadanes(int number[]){
//       int cs=0;
//       int ms=Integer.MIN_VALUE;
//       for(int i=0; i<number.length; i++){
//          cs = cs +number[i];
      
//       if(cs<0){
//          cs=0;
//       }
//       ms =Math.max(cs,ms);
//    }
//       System.out.println("maximum sum of sum array:"+ms);


//    }
//    public static void main(String args[]){
//       int number[] = {-2,-3,4,-1,-2,1,5,-3};
//       kadanes(number);


//    }
// }


//  TO CALCULATE TRAPPED RAINWATER
                                                                                          //   NOTE:
                                                                                          // 1.BE CAREFULL WHEN YOU ASSIGN LEFTMAX AND RIGHTMAX ARRAY
                                                                                          // 2.FOR COMPARING TWO NUMBER WE USE MATHS LIBERARY (Math.max(x,y))
                                                                                          // 3.THERE USE ONLY ONE LOOP AND THIS CODE IS RUN  IS EQUAL TO HEIGHT OF LENGHT(N)
                                                                                          //  THEREFOR [BIGOFF(N)] TIMECOMPLEXCITY
// import java.util.*;
// public class ArrayCC{
//    public static int trappedRainwater(int height[]){                                                      
//       // TO CREATE ARRAY FOR MAX LEFT BOUNDARY
//       int n = height.length;
//       int Leftmax[]= new int[n];
//       Leftmax[0] = height[0];
//       for(int i=1; i<n; i++){
//          Leftmax[i] =Math.max(height[i],Leftmax[i-1]);

//       }


//       // TO CREATE ARRAY FOR MAX RIGHT BOUNDARY
//       int Rightmax[] = new int[n];
//       Rightmax[n-1] = height[n-1];
//       for(int i=n-2; i>=0; i--){
//          Rightmax[i] = Math.max(height[i],Rightmax[i+1]);
//       }
//       int Trappedwater = 0;

//       // CALCULATE MIN OF MAXLEFT &MAXRIGHT=WATER LEVEL
//       for(int i=0; i<n; i++){
//          int Waterlevel = Math.min(Leftmax[i],Rightmax[i]);

//        //  TRAPPEDWATER=WATER LEVEL-HEIGHT

//           Trappedwater += Waterlevel-height[i];
//       }
//       return Trappedwater;


//    }


// public static void main (String args[]){
//    int height[] = {4,2,0,6,3,2,5};
//    System.out.println(trappedRainwater(height));

// }
// }

// BUY &SELL STOCKS
                                                                              // time complexcity o(n) bigooff(n)
// import java.util.*;
// public class ArrayCC {
//    public static int Buysellstocks(int price[]){
//       int Buyprice = Integer.MAX_VALUE;
//       int maxprofit = 0;
//       for(int i=0; i<price.length; i++){
//          if(Buyprice<price[i]){
//            int profit = price[i]-Buyprice;
//            maxprofit = Math.max(maxprofit,profit);

//          }
//          else{
//             Buyprice=price[i];
//          }
//       }
//       return maxprofit;
//    }
//    public static void main (String args[]){
//       int price[] = {7,1,5,3,6,4};
//       System.out.println(Buysellstocks(price));

//    }
// }


// CREATING 2D ARRAY
// import java.util.*;
// public class ArrayCC {
//    public static boolean search(int matrix[][], int key){
     
//       for(int i=0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 if(matrix[i][j]==key){
//                   System.out.println("found at cell:("+i+","+j+")");
//                   return true;
//                 }
//             }
            
//          }
//          System.out.println("not found cell");
//             return false;

//    }
//     public static void main (String args[]){
//         int matrix[][]= new int[3][3];
//         int n = 3;
//         int m = 3;
//                                                                      //   FOR ENTERING NUMBER WITH SPACE LIKE [O][O]1
//                                                                                                             //[0][1]2   
//                                                                                                             // [0][2]3
//         Scanner sc = new Scanner(System.in);                       
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();

//             }
//         } 
//                                                                      // 
//                                                             // 
//                                                             // PRINT IN THE FORM OF MATRIX LIKE

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){                         
//                                                                      //  1 2 3
//                                                                      //  4 5 6
//                                                                      //  7 8 9 
                                                                    
//                 System.out.print(matrix[i][j] + " ");
                 
//             }
//             System.out.println();
//         }
//                                                          //   
//         search(matrix,5);                                                            
//     }
// }




// import java.util.*;
// public class ArrayCC {
//     public static int  sumnumsinrow(int nums[][]){
//         // int  num[]=nums[1];
//         int num[]=nums[1];
//         int sum =0;
//             for (int j=0; j<num.length; j++){
//                 sum = sum + num[j];


//             }
//         return sum;
//     }
//     public static  void main (String args[]){
//         int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };
//         System.out.println(sumnumsinrow(nums));

//     }
// }


// ////////Write a program to FindTransposeofa Matrix.///////////////

// import java.util.*;
// public class ArrayCC{
//     public static int[][] GetTranspose(int matrix[][]){
//         int n = matrix.length;//(number of row)
//         int m = matrix[0].length;//(number of coloumn)

//         int tranMatrix[][] = new int[m][n];

//         for(int i=0; i< tranMatrix.length; i++){
//             for(int j=0; j<tranMatrix[0].length; j++){
//                 tranMatrix[i][j] = matrix[j][i];           
//              }
//         }
//         return tranMatrix;
//     }
//     public static void main (String args[]){
//         int matrix[][] = {{5,6,8},{6,8,7}};

//          int tranMatrix[][]=GetTranspose(matrix);
//         for(int i=0; i<tranMatrix.length; i++){
//             for(int j=0; j<tranMatrix[0].length; j++){
//                 System.out.print(tranMatrix[i][j]+" ");           
//              }
//               System.out.println();
//         }

       



//     }
    
// }



// import java.util.*;
// public class ArrayCC {
//     public static void Spiralmatrix(int matrix[][]){
//         int startrow = 0;
//         int startcolm = 0;
//         int endrow = matrix.length-1;
//         int endcolm = matrix[0].length-1;

//         while(startrow <= endrow && startcolm <= endcolm){
//             // top
//             for(int j=startcolm; j<=endcolm; j++){
//                 System.out.print(matrix[startrow] [j] +" ");
//             }
//         //    right(top to bottom)
//         for(int i=startrow+1; i<=endrow; i++){
//             System.out.print(matrix[i] [endcolm]+" ");
//         }
//         // bottom
//         for(int j=endcolm-1; j>=startcolm; j--){
//             if (startcolm == endcolm){
//                 break;
//             }
//             System.out.print(matrix[endrow][j] +" ");
//         }
//         // left(botoom to top)
//         for(int i=endrow-1; i>=startrow+1; i--){
//              if (startcolm == endcolm){
//                 break;
//             }
//             System.out.print(matrix[i][startcolm]+" ");
//         }
//         startrow++;
//         startcolm++;
//         endrow--;
//         endcolm--;
//         }
//         System.out.println();
//     }
//     public static void main (String args[]){
//         int matrix [][] = {{4,6,2,3},
//                           {8,9,5,6,},
//                           {12,56,14,16},
//                           {15,13,22,45}};
      
//       Spiralmatrix(matrix);                    

//     }
// }


// diognal sum
// import java.util.*;
// public class ArrayCC {
//     public static int diagnalsum(int matrix[][]){
//         int sum = 0;
//         // for(int i=0; i<matrix.length; i++){
//         //     for(int j=0; j<matrix[0].length; j++){
//         //         if(i==j){
//         //             sum+= matrix[i][j];
//         //         }
//         //         else if(i+j==matrix.length-1){
//         //             sum+= matrix[i][j];
//         //         }
//         //     }
        
//         // }
//         for (int i=0; i<matrix.length; i++){
//             // /primary di
//             sum+=matrix[i][i];
//             // scondary diagnal
//             sum+= matrix[i][matrix.length-1-i];

//         }
    
            
        

//         return sum;

//     }

//     public static void main (String args[]){
//         int matrix [][] = {{4,6,2,3},
//                           {8,9,5,6,},
//                           {12,56,14,16},
//                           {15,13,22,45}};
//         System.out.println(diagnalsum(matrix));
       

//     }
// }





// import java.util.*;
// public class ArrayCC{
//     public static boolean stairsearch(int matrix[][],int key){
//         // int row = 0;
//         int i = 0;
//         // int colm = matrix[0].length-1;
//         int j= matrix[0].length-1;
//         while(i < matrix.length && j >= 0){
//             if(matrix[i][j]==key){
//                 System.out.print("value are fount at:("+i+","+j+")");
//                 return true;
//             }
//             else if(key < matrix[i][j] ){
//                 j--;
//             }
//             else{
//                 i++;
//             }
            

//         }
//         System.out.println("key is not found");
//         return false;

//     }



// public static void main (String args[]){
//         int matrix [][] = {{10,20,30,40,},
//                           {15,25,35,45,},
//                           {27,29,37,48},
//                           {32,33,39,50}};
//         int key =33;
//         stairsearch(matrix,33);

       

//     }
// }

import java.util.*;
public class ArrayCC{
    public static boolean stairsearch(int matrix[][],int key){
        // int row = 0;
        int i = matrix.length-1;
        // int colm = matrix[0].length-1;
        int j= 0;
        while(i >=0 && j < matrix[0].length){
            if(matrix[i][j]==key){
                System.out.print("value are fount at:("+i+","+j+")");
                return true;
            }
            else if(key < matrix[i][j] ){
                i--;
            }
            else{
                j++;
            }
            

        }
        System.out.println("key is not found");
        return false;

    }



public static void main (String args[]){
        int matrix [][] = {{10,20,30,40,},
                          {15,25,35,45,},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key =30;
        stairsearch(matrix,30);

       

    }
}

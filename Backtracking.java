//  public class Backtracking{
//     public static void changeArr(int arr[],int i,int value){
//         // base
//         if(i == arr.length){
//             printArr(arr);
//             return;
//         }

//         // recursion (kaam)
//         arr[i]=value;
//         changeArr(arr,i+1,value+1);  // recursion 
//         arr[i] = arr[i]-2; // backtracking

//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     // FIND SUBSETS 
//      public static void findsubset(String str,String ans,int i){
//          // base case
//          if(i == str.length()){
//              if(ans.length() == 0){                
//      System.out.println("null");
//              }
//              else{
//                  System.out.println(ans);
//              }

//         return;
//         }
// //         // recursion
// //         // yes choice
//          findsubset(str,ans+str.charAt(i),i+1);
// //         // no choice
//          findsubset(str,ans,i+1);

//      }
// FIND PARMUTATION 
//      public static void Findpermutation(String str, String ans){
//         // base
//         if( str.length() == 0){
//             System.out.println(ans);
//             return;
//         }
//         // recursion
//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);
//             String newstr = str.substring(0,i) + str.substring(i+1);
//             Findpermutation(newstr,ans+curr);
//         }
//      }
//      public static void main (String args[]){
// //         // int arr[] = new int[5];
// //         // changeArr(arr,0,1);
// //         // printArr(arr);
//     //    String str = "abc";
//         //  findsubset(str,"",0);
//         String str = "abc";
//         Findpermutation(str,"");
//      }
//  }
//  FIND N QUEENS
// public static boolean isSafe(char board[][],int row, int col){
//     // vertical up 
//     for(int i=row-1; i>=0; i--){
//         if(board[i][col]=='Q'){
//         return false;
//         }
//     }
//     //left diaogonal up
//     for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//         if(board[i][j]=='Q'){
//             return false;
//             }
        
//     }
//     // right diagonal up
//     for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//         if(board[i][j]=='Q'){
//             return false;
//             }
    
//     }
//     return true;
// }
// public static boolean NQueens(char board[][],int row){
//     if(row == board.length){
//         // printboard(board);
//         // count++;
//         return true;
//     }
//     //coloum call
//     for(int j=0; j<board.length; j++){
//         if(isSafe(board,row,j)){
//             board[row][j] = 'Q';
//             if(NQueens(board,row+1)){// function call
//             return true;
//             }
//             board[row][j] = 'X';//backtracking

//         }
       
       
//     }
//     return false;

// }
// public static void printboard(char board[][]){
//     System.out.println("_______________chess board_______________");
//     for(int i=0; i<board.length; i++){
//         for(int j=0; j<board.length; j++){
//             System.out.print(board[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
// // static int count = 0;
// public static void main (String args[]){
//     int n=4;
//     char board[][] = new char[n][n];
//     //initializeS
//     for(int i=0; i<n; i++){
//         for(int j=0; j<n; j++){
//             board[i][j] = '.';
//         }
//     }
//     if(NQueens(board,0)){
//         System.out.println("solution is possible");
//         printboard(board);
//     }else{
//         System.out.println("solution is not not possible");
//     }
//     // System.out.println("total ways to solve NQueens:" + count);

// }
 //  }



//  GRIDWAYS
//  import java.util.*;
//  public class Backtracking{
//     public static int Gridways(int i,int j, int n,int m){
//         if(i == n-1 && j == m-1){
//             return 1;
//         }
//         if(i == n || j == m){
//             return 0;
//         }
//        int w1 =  Gridways(i,j+1,n,m);
//        int w2 = Gridways(i+1,j,n,m);
//        return w1+w2;
//     }
 
//  public static void main (String args[]){
//     int n = 3;
//     int m = 3;
//    System.out.println(Gridways(0,0,n,m));

//  }
// }




// SUDOKU
import java.util.*;
public class Backtracking {
    public static boolean isSafe( int sudoku[][], int row,int col,int digits){
        // column
        for(int i=0; i<=8; i++ ){
           if(sudoku[i][col]==digits){
            return false;
           }

        }
         // row
         for(int j=0; j<=8; j++){
            if(sudoku[row][j] == digits){
                return false;
            }
         }
        //  grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        // 3*3
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j]==digits){
                    return false;
                }
            }
        }
        return true;
    }
  
    public static boolean sudokusolver(int sudoku[][],int row,int col){
        // base
        if( row == 9  && col == 0 ){
            return true;
        }
        // recursion
        int nextrow = row, nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokusolver(sudoku,nextrow,nextcol);
        }
        for(int digits=1; digits<=9; digits++){
            if(isSafe(sudoku,row,col,digits)){
            sudoku[row][col] = digits;
            if(sudokusolver(sudoku,nextrow,nextcol)){
                return true;
            }
            sudoku[row][col] = 0;

            }
        }
        return false;
    }
    public static void printsudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main (String args[]){
        int sudoku[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,1,3},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}

        }; 

        if(sudokusolver(sudoku,0,0)){
            System.out.println("solution exist");
            printsudoku(sudoku);
         }else{
         System.out.println("solution  not exist");
         }
    }
}







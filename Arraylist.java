// import java.util.ArrayList;
//  public class Arraylist{


//  public static void main (String args[]){
//      ArrayList<Integer> list = new ArrayList<>();
//      ArrayList<String> list1 = new ArrayList<>();
//      ArrayList<Boolean> list2 = new ArrayList<>();
// //     // ADD operation
//      list.add(1);
//      list.add(2);
// //     list.add(3);
// //     list.add(4);
//      list.add(5);
// //     //we add element on perticular index 
//  list.add(3,34);
//  System.out.println(list);


// //     //size of arraylist
// //     System.out.println(list.size());
   



// //     // print the array list
// //     for(int i=0; i<list.size(); i++){
// //       System.out.print(i +" ");
// //     }
// //     System.out.println();
// //     for(int i=0; i<list.size(); i++){
// //       System.out.print(list.get(i) +" ");
// //     }
// //     System.out.println();

// //       // get operation --> o(1)
// //     // int element = list.get(2);
// //     // System.out.println(element);

// //     // // delete operation --> o(n)
// //     // list.remove(3);
// //     // System.out.println(list);


// //     //set
// //     // list.set(2,10);
// //     // System.out.println(list);
    

// //     //contains (exist are not)
// //     System.out.println(list.contains(1));
// //     System.out.println(list.contains(11));
//      }
//  }



// import java.util.ArrayList;
// import java.util.Collections;
// public class Arraylist{
//   public static void Swap(ArrayList<Integer> list,int idx1 ,int idx2){
//     int temp = list.get(idx1);
//     list.set(idx1,list.get(idx2));
//     list.set(idx2,temp);
//   }

//   public static void main (String args[]){
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(7);
//     list.add(0);
//     list.add(8);
//     list.add(1);
//     list.add(2);
//     System.out.println(list);
// //     // reverse the number 
// // //for(int i=list.size()-1; i>=0; i--){
// //       //System.out.print(list.get(i) +" ");
// // //}
//        //SWAP THE TWO NUMBER
//     //  int idx1 = 2;
//     //    int idx2 = 4;
//     //   Swap(list,idx1,idx2);
//     //   System.out.println(list);




//     // SORT THE RANDAM NUMBER
//     Collections.sort(list);    //acending order
//     System.out.println(list);
//    Collections.sort(list,Collections.reverseOrder());   //decending order
//     System.out.println(list);

    
//    }
//   }

  // import java.util.*;
  // public class Arraylist{
  //   public static void main (String args[]){
  //     ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
  //     ArrayList<Integer> list = new ArrayList<>();
  //     list.add(1); list.add(2);
  //     mainlist.add(list);

  //     ArrayList<Integer> list2 = new ArrayList<>();
  //     list2.add(3); list2.add(4);
  //     mainlist.add(list2);

  //     for(int i=0; i<mainlist.size(); i++){
  //       ArrayList<Integer> currnt = mainlist.get(i);
  //       for(int j=0; j<currnt.size(); j++){
  //         System.out.print(currnt.get(j) + " ");

  //       }
  //       System.out.println();
  //     }
  //     System.out.println(mainlist);

      
  //   }
  // }




     import java.util.*;
   public class Arraylist{
     public static void main (String args[]){
       ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       ArrayList<Integer> list3 = new ArrayList<>();

       for(int i=1; i<=5; i++){
        list1.add(i);
        list2.add(i*2);
        list3.add(i*3);
       }
       mainlist.add(list1);
       mainlist.add(list2);
       mainlist.add(list3);

       System.out.println(mainlist);

       for(int i=0; i<mainlist.size(); i++){
        ArrayList<Integer> currnt = mainlist.get(i);
        for(int j=0; j<currnt.size(); j++){
          System.out.print(currnt.get(j) + " ");
        }
        System.out.println();
       }
       
     }
    }




  //CONTAINER WITH MAXIMUM WATER 
  //   import java.util.*;
  //  public class Arraylist{
  //   public static int optmizStorewater(ArrayList<Integer> height){
  //     int maxwater = 0;
  //     int Lp = 0;
  //     int Rp= height.size()-1;
  //     //calculate maxwater 
  //     while(Lp<Rp){
  //       int hgt = Math.min(height.get(Lp),height.get(Rp));
  //       int width = Rp-Lp;
  //       int water = hgt*width;
  //       maxwater = Math.max(maxwater,water);
  //       //update ptr
  //       if(Lp<Rp){
  //         Lp++;
  //       }
  //         else{
  //           Rp++;
  //         }
  //       }
  //       return maxwater;
  //     }
      
    
  //   // public static int Storewater(ArrayList<Integer> height){
  //   //   int maxwater=0;
  //   //   for(int i=0; i<height.size(); i++){
  //   //     for(int j=i+1; j<height.size(); j++){
  //   //       int hgt = Math.min(height.get(i),height.get(j));
  //   //       int width = (j-i);
  //   //       int water = hgt*width;
  //   //       maxwater = Math.max(maxwater,water);
  //   //     }
  //   //   }
  //   //   return maxwater;

  //   // }
  //    public static void main (String args[]){
       
  //      ArrayList<Integer> height = new ArrayList<>();

  //      height.add(1);
  //      height.add(8);
  //      height.add(6);
  //      height.add(2);
  //      height.add(5);
  //      height.add(4);
  //      height.add(8);
  //      height.add(3);
  //      height.add(7);
  //      System.out.println(optmizStorewater(height));
       
  //    }
  //  }







  //  pair sum -1 
  // import java.util.*;
  // public class Arraylist{
  //   // public static boolean pairSum1(ArrayList<Integer> list1,int target){
  //   //   for(int i=0; i<list1.size(); i++){
  //   //     for(int j=i+1; j<list1.size(); j++){
  //   //       if(list1.get(i) + list1.get(j) == target){
  //   //         return true;
  //   //       }
  //   //     }
  //   //   }
  //   //   return false;
  //   // }


  //   public static boolean pairsum1(ArrayList<Integer> list1, int target){
  //     int Lp =  0;
  //     int Rp = list1.size()-1;
  //     while(Lp != Rp){
  //     if(list1.get(Lp)+ list1.get(Rp) == target){
  //       return true;
  //     }
  //     if(list1.get(Lp)+list1.get(Rp)<target){
  //       Lp++;
  //     }
  //     else{
  //       Rp--;
  //     } 
  //   }
  //   return false;
  //   }
  // public static void main(String args[]){
  //   ArrayList<Integer> list1 = new ArrayList<>();
  //   list1.add(1);
  //   list1.add(2);
  //   list1.add(3);
  //   list1.add(4);
  //   list1.add(5);
  //   int target = 5;
  //   System.out.println(pairsum1(list1,target));
  // }
  // }
  


  //PAIR SUM 2 TWIST IS THAT IN THIS WE HAVE TO GIVEN  SORTED & ROTED ARRAY
  // import java.util.*;
  // public class Arraylist{
  //   public static boolean pairsum2(ArrayList<Integer> list, int targate){
  //     int bp =-1;
  //     int n = list.size();
  //     for(int i=0; i<list.size(); i++){
  //       if(list.get(i)> list.get(i+1)){
  //         bp = i;
  //         break;
  //       }
  //     }

  //     int Lp = bp+1;  //smallest
  //     int Rp = bp; //greatest
  //     while(Lp != Rp){
  //       //case 1
  //       if(list.get(Lp) + list.get(Rp) == targate){
  //         return true;
  //       }
  //       //increas & decreas Lp and Rp 
  //       //case 2 Updation
  //       if(list.get(Lp) + list.get(Rp) < targate){
  //         Lp = (Lp+1)%n;
  //       }
  //       else{
  //         Rp = (n+Rp-1)%n;
  //       }
  //     }
  //     return false;

      
  //   }
  //   public static void main(String args[]){
  //     ArrayList<Integer> list =  new ArrayList<>();
  //     list.add(11);
  //     list.add(15);
  //     list.add(6);
  //     list.add(8);
  //     list.add(9);
  //     list.add(10);

  //     int targate = 16;
  //     System.out.println(pairsum2(list,targate));
  //   } 
  // }
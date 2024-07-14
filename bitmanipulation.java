import java.util.*;
public class bitmanipulation{
  public static void evenOrodd(int n){
    int bitmask = 1;
    if((n&bitmask)==0){
      System.out.println("it is even");
    }
    else{
      System.out.println("it is odd");
    }
  }

  public static int getithpossition(int n, int i){
    int bitwise = 1<<i;
    if((n & bitwise) == 0){
      return 0;

    }else{
      return 1;
    }
  }
  public static int setithpossition(int n, int i){
    int bitwise = 1<<i;
    return n | bitwise ;

  }
   public static int clearithpossition(int n, int i){
    int bitwise = ~(1<<i);
    return n & bitwise ;

  }
  public static int updateithpossition(int n, int i,int newbit){
    if(newbit == 0){
      return clearithpossition(n,i);
    }else{
      return setithpossition(n,i);
    }
    // n = clearitpossition(n, i);
    // int bitmask = newbit<<i;
    // return n | bitmask;

  }
  public static int clearlastbit(int n,int i){
    int bitmask = (~0)<<i;
    return n & bitmask;
  }
  public static int clearbitsinrange(int n,int i,int j){
    int a = ((~0)<<(j-1));
    int b = (1<<i)-1;
    int bitmask = a|b;
    return n & bitmask;
  }
  public static boolean ispoweroftwo(int n){
    return (n&n-1)==0;
  }
  public static int Countsetbits(int n){
    int count = 0;
    while(n>0){
      if( (n&1) != 0){     //check our most LSB
      count++;
      }
      n = n>>1;
    }
    return count++;
  }
    
    public static void main (String args[]){
      //   System.out.println((5 & 6));
      //   System.out.println((5 | 6));
      //     System.out.println((5 ^ 6));
      //       System.out.println(( ~5));
      //  System.out.println((5<<2));
      //   System.out.println((6>>1));
      // evenOrodd(11);
      // evenOrodd(10);
      // evenOrodd(4);
      // System.out.println(getithpossition(15,2));
        // System.out.println(setithpossition(10,3));
          // System.out.println(clearithpossition(10,1));
          // System.out.println(updateithpossition(10,2,1));
          // System.out.println(clearlastbit(15,2));
          // System.out.println(clearbitsinrange(10,2,7));
          // System.out.println(ispoweroftwo(9));
          System.out.println(Countsetbits(15));
    }
  } 
                

                






    


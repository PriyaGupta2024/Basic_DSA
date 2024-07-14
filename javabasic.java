// import java.util.*;
// public class javabasic {
//     public static void main (String args[]) {
//         Scanner sc = new  Scanner(System.in);
//         String name =sc.nextLine();
//         System.out.println(name);


//     }
// } 




//public class javabasic {
   //public javabasic() {
   //}

   //public static void main(String args[]) {
      //System.out.print("hello world!");
   //}
//}

// import java.util.*;

// public class javabasic {
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b =sc.nextInt();
//     int product = a*b;
//     System.out.println(product);

//     }
// }

// import java.util.*;
// public class javabasic {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//          int n = sc.nextInt();
//          int sum = 0;
//         int counter =1;
//         while(counter<=n) {
//             sum= sum+counter;
//             System.out.print(sum);
//             counter++;

//         }
//         System.out.println("sum of natural :" + sum);
        
//            }
// }



// public class javabasic {
//     public static void main(String args[]) {
        
//         // while(line<=4) {
//         //     System.out.println("****");
//         //     line++;

//         // }
//         for(int i=0;i<=5;i++) {
//             System.out.println("hello world");
//             i+=2;
//         }
//     }
// }


// import java.util.*;
// public class javabasic {
//     public static void main (String args[]) {
//         int age = 22;

//         String type = (age<=18)? "teenager":"adult";
//         System.out.println(type);




//     }
// }



// import java.util.*;
// public class javabasic {
//     public static void main(String args[]) {
//         double temp = 103.5;
//         if (temp>=100){
//             System.out.println("she have fever");
        
//         }
//         else {
//             System.out.println("she don't have fever");
//         }
//     }

// }


// function  

// public class javabasic { 
//     public static  int multiplication (int a,int b) {
//        int c=a*b;
//     //    System.out.println("multiplication is :" + c); 
//         return c;
//     }
    

//     public static void  main (String args[]) {
//         int a=5;
//         int b=6;
//     int c= multiplication(a,b);
//      System.out.println("multiplication is :" + c); 
//     c= multiplication(12,20);
//      System.out.println("multiplication is :" + c); 
//     }
// }


// factorial
// public class javabasic{
//     public static int factorial (int n ){
//         int a = 1; 
//         for (int i = 1; i<=n;i++){
//             a = a*i;
            
//         }
//           System.out.println("factorial of number is:" + a);
//             return a;
//     }
//     public static int bincoeff(int n,int r) {
//         int fact_n= factorial(n);
//         int fact_r= factorial(r);
//         int fact_nmr= factorial(n-r);

//         int bincoeff= fact_n/(fact_r*fact_nmr);
//         return bincoeff;
//     }
//     public static void main(String args[]){
//         System.out.println(bincoeff(5,2));
//     //    int a= factorial(4);
//     //  System.out.println("factorial of number is:" + a);
//     // a = factorial(5);
//     // a = factorial(10);
//     }
// }

//  public class javabasic {
// public static void main (String args[]){
//     int n = 4;
//     for(int line = 1; line <=n; line++){
//           for(int star=1; star<=n-line+1; star++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// }
// }

//  half pyramid 





// hollow rectangle
public class javabasic {
    public static void hollow_rectangle(int totrows,int totcols) {
        //  outer cell
        for(int i=1; i<=totrows; i++) {
            // inner loop
            for (int j=1; j<=totcols; j++ ) {
                // cell=i ,j 
                if (i==1 || i==totrows || j==1 || j==totcols) {
                    System.out.print("*");
                }
                else{
                System.out.print(" ");

            }
            

        }
        System.out.println();


    }
}
public static void inverted_half_pyramid(int n) {
    //outer loop
    for(int i=1; i<=n; i++) {
        //inner loop
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
           System.out.println();   
        }
}
public static void inverted_half_pyramid_withnumber(int n) {
    //outer loop
    for(int i=1; i<=n; i++) {
        //inner loop
        for(int j=1; j<=n-i+1; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void floyds_triangle(int n) {
    int counter = 1;
    //outer
    for(int i=1; i<=n; i++) {
        //inner- how many times counter will print
        for(int j=1; j<=i; j++) {
            System.out.print(counter+" ");
            counter++;

        }
        System.out.println();

    }

}
public static void zero_one_triangle(int n){
    //outer loop
    for(int i=1; i<=n; i++){
        //inner loop
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }
        System.out.println();

    }
}
public static void butterfly(int n) {
    for(int i=1; i<=n; i++){
        //stars
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");

        }
        System.out.println();

    }

//2nd half
          for(int i=n; i>=1; i--){

             for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
         for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");

        }
        System.out.println();

    }

}
public static void solid_rhombus(int n) {
    for(int i=1; i<=n; i++){
        // space 
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void hollow_rhombus(int n){
    for(int i=1; i<=n; i++){
        // space 
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void diomand(int n){
    // 1st half
    for(int i=1; i<=n; i++){
        // space 
        for(int j=1; j<=(n-i); j++ ){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");

        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){
         for(int j=1; j<=(n-i); j++ ){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");

        }
        System.out.println();
    }
}




public static void main (String args[]) {
    // hollow_rectangle(4,5);
//    inverted_half_pyramid(8);
   //inverted_half_pyramid_withnumber(5);
//    floyds_triangle(5);
//    zero_one_triangle(5);
    // butterfly(6);
    // solid_rhombus(5);
    // hollow_rhombus(5);
    diomand(7);


}
}

// import java.util.*;
// public class Strings{
   
//         public static void printLetters(String str){
//             for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i) + " ");

//             }
//             System.out.println();
//         }
//          public static void main (String args[]){
//     // char arr[] = {'a','b','c','d','e'};
//     // String str = "abcde";
//     // String str2 = new String("xyz");
//     // Scanner sc = new Scanner(System.in);
//     // //  String name;
//     // String name2;
//     // //  name = sc.next();                             //when we use next we can write only one words without giving any spacing
//     // name2 = sc.nextLine();                                                //when we want with spacing whole sentences then use "NEXTLINE".
//     // //  System.out.println(name);
//     // System.out.println(name2);
//     // String Fullname = "priya gupta";
//     // System.out.println(Fullname.length());

//     // concatination 
//     String firstname = "priya";
//     String lastname = "gupta";
//     String fullname = firstname + " " + lastname;
//     System.out.println(fullname);



//     // string charAt methed
//     String firstname1 = "priya";
//     String lastname1 = "gupta";
//      String fullname1 = firstname1 + " " + lastname1;
//      System.out.println(fullname1.charAt(0));              //for printing individual letter  to given string make new function 
//      printLetters(fullname1);
// }
// }


// palindrome (madam,mam,mom)                            //O(n) timecomplexcity
// import java.util.*;
// public class Strings {
//     public static boolean ispalindrome(String str){
//         int n = str.length();
//     for(int i=0; i<n/2; i++){
//         if(str.charAt(i) != str.charAt(n-1-i)){
//             return false;
//         }
//     }
//     return true;
//     }
//     public static float getShortestpath(String path){
//          int x=0;
//          int y= 0;
//         for(int i=0; i<path.length(); i++){
//             char dir = path.charAt(i);
            
//             if(dir == 'N'){
//                 y++;
//             }
//             else if(dir == 'S'){
//                 y--;
//             }
//             else if(dir == 'E'){
//                 x++;
//             }
//             else{
//                 x--;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);
//     }


//     // subString
//     public static String substring(String str, int si,int ei){
//         String substr = "";
//         for(int i=si; i<ei; i++){
//             substr += str.charAt(i);
//         }
//         return substr;
//     }

//     // public static void main (String args[]){
//     //     String s1 = "charu";
//     //     String s2 = "charu";
//         // String s3 = new String("charu");
//         // if(s1 == s2){
//         //     System.out.println("String are equal");
//         // }
//         // else{
//         //     System.out.println("String are not equal");
//         // }
//         // if(s1 == s3){
//         //     System.out.println("String are  equal");                 //this are equal but there is not work (==) because we compare with string 
//         // }                                                              // for string we use (.equals) function
//         // else{
//         //      System.out.println("String are not equal");
//         // }
//     //     if(s1.equals(s3)){
//     //         System.out.println("String are  equal");     
//     //     }
//     //     else{
//     //         System.out.println("String are not equal");
//     //     }

//     // }

// public static void main (String args[]){
// //     String str = "madam";
// //     String path = "WNEENESENNN";
// //     System.out.println(getShortestpath(path));
//     // System.out.println(ispalindrome(str));
//     String str = "Helloworld";
//     System.out.println(substring(str,5,10));

// }
// }

//For a given set of String print the largest string 
// import java.util.*;
// public class Strings{
// public static void main (String args[]){
//     String fruits[] ={"apple", "mango","banana"};
//     String largest = fruits[0];
//     for(int i=1; i<fruits.length; i++){
//         if(largest.compareTo(fruits[i])<0){  //this case for largest save smallest string which is we don't want so we have to store in largest gretest
//         largest = fruits[i];
        
//     }
//     }
//     System.out.println(largest);

// }
// }


//StringBuilder
import java.util.*;
public class Strings{
        public static String toUpperCase(String str){
            StringBuilder sb = new StringBuilder("");

            char ch =Character.toUpeerCase(str.charAt(0));
            sb.append(ch);
            for(int i=1; i<str.length(); i++){
                if(str.charAt(i)== ' ' && i<str.length()-1){
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));

                }
                else{
                    sb.append(str.charAt(i));
                }
            }
              return sb.toString();

        }
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);     //to attach next letter with the privious
        // }                         //O(n)   O(26)
        // System.out.print(sb);
          public static void main(String args[]){
        String str = "hii i am priya gupta";
        System.out.println(toUpperCase(str));
    }
}
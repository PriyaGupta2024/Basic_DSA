// public class OOPs{
//     public static void main(String args[]){
//         pen p1 = new pen ();  //created pen object which is called p1
//         p1.setColor("blue");
//         System.out.println(p1.getcolor());
//         p1.setTip(4);
//         System.out.println(p1.gettip());
        // p1.setColor("yellow");
        // System.out.println(p1.getcolor());
        // bankaount Myacount = new bankacount();
        // Myacount.username = "priya";
        // Myacount.password = "asdgbdf";
        // Myacount.password = "sdasff";
    // }

// }
// class bankacount{
//      public String username;
//     private String password;
//     public void setpassword(String pwd){
//         password = pwd;
//     }
// // }
// class pen {
//     // property&function
//     private String color;
//     private int tip;
//     String getcolor(){
//         return this.color;
//     }

//     int gettip(){
//         return this.tip;
//     }
//     void setColor(String newcolor ){
//         this.color = newcolor;
//     }
//     void setTip(int newtip){
//         tip = newtip;
//     }

// }





// public class OOPs{
//     public static void main(String args[]){
//         student s1 = new student();
//         student s2 = new student(20);
        //     }
// }


// class student{
//     String name;
//     int age;
//     int roll;
//     student(){
//         System.out.println("my name is Sofia & Elijah");
//     }
//     student(int age){
//         this.age = age;

//     }
//                                             //there create error because we define one datatype of two time in the constructor(student) 
    

// }





// // copy constructor
// import java.util.*;
// public class OOPs{
// public static void main(String args[]){
//     student s1 = new student();
//     s1.name = "priya";
//     s1.roll = 2343;
//     s1.password = "abcd";
//     s1.marks[0] = 100;
//     s1.marks[1] = 90;
//     s1.marks[2] = 80;

//     student s2 = new student(s1); //copy constructor call
//     s2.password = "xyz";
//     s1.marks[2] =100;
//     for(int i=0; i<3; i++){
//         System.out.println(s2.marks[i]);
//     }
// }
// }
// class student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // shallow / copy constructor
// //  student (student s1){
//      // marks = new int[3];
// //     this.name = s1.name;
// //     this.roll = s1.roll;
// //     this.marks = s1.marks;


// //  }

// // deep copy constructor
// student (student s1){
//       marks = new int[3];
//       this.name = s1.name;
//       this.roll = s1.roll;
//       for(int i=0; i<3; i++){
//         this.marks[i] = s1.marks[i];
//       }
// }
//  student(){
//     marks = new int[3];
//     System.out.println("My Name is Priya");
//  }
//  student (String name){
//      marks = new int[3];
//     this.name = name;
//  }
//  student(int roll){
//      marks = new int[3];
//     this.roll = roll;
//  }
// }





// import java.util.*;
// public class OOPs {
//     public static void main (String args[]){
//         // Fish Shark = new Fish();
//         // Shark.eats();
//         dog dobby = new dog();
//         dobby.eats();
//         dobby.legs =4;
//         System.out.println(dobby.legs);

//     }
// }
// // base class 
// class Animal{
//     String color;

//     void eats(){
//         System.out.println("Eats");
//     }

//     void breath(){
//         System.out.println("Breaths");
//     }
// }

// class memmal extends Animal{
//     int legs;

// }
//                                                         //   from 152 to 171 shows multi level inheritance
// class dog extends memmal{
//     String breed;
// }

// derived class 
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("fish swim in water");
//     }

// }




// Hierarchial Inheritance
// import java.util.*;
// public class OOPs {
//     public static void main (String args[]){
//         // Fish Shark = new Fish();
//         // Shark.eats();
//         bird buddy = new bird();
//         buddy.eats();
//         buddy.fly();
//         fish fishy = new fish();
//         fishy.breath();

//     }
// }
// class Animal{
//     String color;

//     void eats(){
//         System.out.println("Eats");
//     }

//     void breath(){
//         System.out.println("Breaths");
//     }
// }
// class memmal extends Animal{
//     void walk(){
//     System.out.println("walk");
//     }

// }
// class fish extends Animal{
//     void swim(){
//     System.out.println("swim");
//     }

// }
// class bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }

// }



// method overloading
// import java.util.*;
// public class OOPs {
//     public static void main(String args[]){
//         // calculater calc = new calculater();
//         // System.out.println(calc.sum(1,2));
//         // System.out.println(calc.sum((float)1.5,(float)2.5));
//         // System.out.println(calc.sum(1,2,6));
//         deer d = new deer();
//         d.eat();

//     }
// }
// //method overriding
// class animal{
//     void eat(){
//         System.out.println("eat anything");
//     }                                                            // from 245 to 254 indicat method overriding
// }
// class deer extends animal{
//     void eat(){
//         System.out.println("eat grass");
//     }
// }
// class calculater{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a,int b, int c){
//         return a+b+c;
//     }
// }




// import java.util.*;                                  //packages in java 
// public class OOPs{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(a);
//     }
// }



// //abstract class 
// public class OOPs {
//     public static void main (String args[]){
//         mustung myhorse = new mustung();
//         // horse H = new horse();
//         // H.eat();
//         // H.walk();
//         // System.out.println(H.color);

//         // chicken c = new chicken();
//         // c.eat();
//         // c.walk();


//     }
// }
// abstract class animal{
//     animal(){
//     System.out.println("Animal constructor called.....");
//     }
    // String color;
    // animal(){
    //     color = "brown";
    // }
//     void eat(){
//         System.out.println("animal can eat");
//     }
//     abstract void walk();
    
// }
// class horse extends animal{
//     horse(){
//         System.out.println("horse constructor called.....");
//     }
//     // void changecolor(){
//     //     color = "dark color";

// //}
//     void walk(){
//         System.out.println("walk on 4 legs");

//     }
// }

// class mustung extends horse{
//     mustung(){
//         System.out.println("mustung constructor called....");
//     }
// }
// class chicken extends animal{
//     chicken(){
//         System.out.println("chicken constructor called.....");
//     }
//     // void changcolor(){
//     //     color = "yellow";
//     // }
//     void walk(){
//         System.out.println("walk on 2 legs");
//     }
// }    

 

// // interface 
// import java.util.*;
// public class OOPs {
//     public static void main(String args[]){
//         queen q = new queen();
//         q.move();

//     }
// }

// interface chesplayer{
//     void move();
// }

// class queen implements chesplayer{
//     public void move() {
//         System.out.println("up, down, left, right, diagonal (in all direction) ");

//     }

// }
// class rook implements chesplayer{
//     public void move(){
//         System.out.println("up, down, left, right ");
//     }
// }
// class king implements chesplayer{
//     public void move(){
//         System.out.println("up, down, left, right, diagonal (in one step)");
//     }
// }


// multipal inheritance
// import java.util.*;
// public class OOPs {
//     public static void main(String args[]){
//         beer B = new beer();
//         B.eats();
//         B.eat();
    

//     }
// }

// interface herbivore {

//     void eats();
// }

// interface carnivore {
//     void eat();

// }

// class beer implements herbivore,carnivore {
//     public void eats() {
//         System.out.println("animal can eat grass");

//     }
//     public void eat(){
//         System.out.println("animal can eats anything");

//     }

// }





// //static keywords
// import java.util.*;
// public class OOPs{
//     public static void main (String args[]){
//         student s1 = new student();
//         s1.schoolname = "sgpv";

//         student s2 = new student();
//         System.out.println(s2.schoolname);

//         student s3 = new student();
//         s3.schoolname = "ABC";
    

// }
// }

// class student {
//     String name;
//     int roll;
//     static String schoolname;


//      void setname (String name){
//         this.name = name;
//      }

//  String getname (){
//        return this.name;
//  }

 
// }



// super keyword

public class OOPs{
    public static void main (String args[]){
        horse h = new horse();                                  //object creation
        System.out.println(h.color);

    }
}
class animal{
    String color;
    animal(){
        System.out.println("animal constructor called");
    }
}
class horse extends animal{
    horse(){

        super.color = "brown";
        System.out.println("horse constructor called");
    }

}
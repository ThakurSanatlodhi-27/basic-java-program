
// public class OPPS {
//     public static void main(String args[]){
//         Student s1 =new Student();
        
//     }
// }
//     class Student{
//         String name;
//         int rollNo;
//        Student(){
       
//         System.out.println("sanat");


    
//         }
//     }
// public class OOPS{
//     public static void main(String args[]){
//         Student stu=new Student();
//         Student stu1=new Student(2568);
//         Student stu3=new Student("sanat");
//         Student stu2=new Student(1254,"sanayt");

//     }
// }
// class Student{
//     int roll;
//     String name;
//     Student(){
//         System.out.println("this is ram");

//     }
//     Student(String name){
//        this.name=name;
//        System.out.println(name);
//     }
//     Student(int roll){
//         this.roll=roll;
//         System.out.println(roll);
//     }
//     Student(int roll,String name){
//         this.name=name;
//         this.roll=roll;
//         System.out.println(roll +" "+name);
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
        
//        Mammels dogy=new Mammels();
//        dogy.legs=4;
//        dogy.eat();
//        System.out.println(dogy.legs);

//        Fish fish=new Fish();
//        fish.breaths();
//        int fins=6;
//        System.out.println(fins);
//        fish.swim();

//        Birds ullu=new Birds();
//        ullu.eat();
//        ullu.breaths();
//        ullu.fly();

//     }
//     }
//      class Animal{
//         String color;

//         void eat(){
//             System.out.println("eat foood");
//         }
//         void breaths(){
//             System.out.println("breath here");

//         }
//     }
// //      class Fish extends Animal{
// //         int fins;
// //         void swim(){
// //             System.out.println("swim karti ho ki nahi");
// //         }
// //     }
// //     class Mammels extends Animal{
// //         int legs;
// //         void walk(){
// //             System.out.println("walk");
// //         }
// //     }
// //     class Birds extends Animal{
// //         void fly(){
// //             System.out.println("flying");
// //         }
// //     }

// public class OOPS{
//     public static void main (String args[]){
//         Animal ani=new Animal();
//         ani.eye=2;
//         ani.breath();
//         System.out.println(ani.eye);

//         Fish fish=new Fish();
//         fish.eat();
//         fish.fins=6;
//         System.out.println(fish.fins);
//         fish.swim();

//         Tuna tuna=new Tuna();
//         tuna.color="red";
//         System.out.println(tuna.color);
//         tuna.small();
//         tuna.swim();
//         tuna.eat();

//         Shark shark=new Shark();
//         shark.big();
//         shark.breath();

//         Birds birds=new Birds();
//         birds.legs=1000;
//         birds.color();
//         System.out.println(birds.legs);
//         birds.eat();

//         Peacock pea=new Peacock();
//         pea.dance();
//         pea.color();
//         pea.breath();

//         Mammel mem=new Mammel();
//         mem.hand();
//         mem.eye=23;
//         System.out.println(mem.eye);


//     }
// }
// class Animal{
//     int eye;
//     void eat(){
//         System.out.println("eat is good for health");
        
//     }
//     void breath(){
//         System.out.println("breath lete reho");
//     }

// }
// class Fish extends Animal{
//     int fins;
    
//     void swim(){
//         System.out.println("swimming karna h ki nahi");
//     }
// }
// class Tuna extends Fish{
//     String  color;
//     void small(){
//         System.out.println("it is small");
//     }
// }
// class Shark extends Fish{
//     String color;
//     void big(){
//         System.out.println("it is so Big");
//     }
// }
// class Birds extends Animal{
//     int legs;
//     void color(){
//         System.out.println("its color is red");
//     }
// }
// class Peacock extends Birds{
//     void dance(){
//         System.out.println("dancing is only rainy season");
          
//     }
// }
// class Mammel extends Animal{
//     int legs;
//     void hand(){
//         System.out.println("its has four legs");
//     }
// }

// public class OOPS{
//         public static void main(String args[]){
//             Calculator cal=new Calculator();
//             System.out.println(cal.sum(12,24));
//             System.out.println(cal.sum(54,89,78,25));
//             System.out.println(cal.sum(41.23f,56.87f));
//             System.out.println(cal.sum(56,36.54f,"rayamana",'h'));


//         }
//     }
// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a,float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c,int d){
//         return a+b+c+d;
//     }
//     String sum(int a,float b,String sanat,char h){
//         return a+b+sanat+h;
//     }

// }    
// public class OOPS{
//     public static void main(String args[]){
//         Animal d=new Animal();
//         d.eat();

//     }
// }
// class Animal{
//     void eat(){
//         System.out.println("eat is good for health");

//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eating grass");
//     }
// }

// 
//

// public class OOPS{
//     public static void main(String args[]){
//         Bear b=new Bear();
//         System.out.println(b.legs( 665));
//         b.eat();
//         b.drink();
//         b.sleep();

//     }
// }
// interface Harbivore{
//     void eat();
//     int legs(int gas);

// }
// interface Carnivour{
//     void drink();
//     void sleep();
    
// }
// class Bear implements Harbivore,Carnivour{
//     public void eat(){
//         System.out.println("this type of animal is eating grass");
//     }
//     public int legs(int gas){
//         //gas=6;//int legs=6;
//         return gas;
        
//     }
//     public void drink(){
//         System.out.println("drint 10 liter water");
//     }
//     public void sleep(){
//         System.out.println("sleep is up to eight hour");
//     }
//     void food(){
//         System.out.println("food is good for health");
//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.schoolname="gurukul";
//         Student s2=new Student();
//         System.out.println(s2.schoolname);
//         Student s3=new Student();
//         System.out.println(s1.persentage(56,52,78));
       
//     }
// }
// class Student{
//     String name;
//     int rollNo;
//     static int persentage(int a,int b,int c){
//         return ((a+b+c)/3);
//     }

//     static String schoolname;
//     void setName(){
//         this.name=name;
//     }
//     String getName(){
//         return this.name;
//     }

// }
// public class OPPS{
//     public static void main(String args[]){
//         Horse h=new Horse();
//         System.out.println(h.color);

        
//     }
// }
// class Animal{
//     String color;
//     Animal(){
//         System.out.println("animal constructor is called");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         super.color="brown";

//         System.out.println("horse constructor is called");
    
// }
// }

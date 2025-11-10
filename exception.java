import java.util.*;
public class exception{
public static void main (String args[]){
    //try-catch in exception handling
    int[]marks={97,45,89};
    try{
        System.out.println(marks[5]);
    }catch(Exception exception){
        //do something after catching
    }
    System.out.println("the name is sanat lodhi");
}
}
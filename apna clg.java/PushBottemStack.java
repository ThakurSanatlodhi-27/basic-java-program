import java.util.*;
import java.util.Stack;
public class PushBottemStack {
    public static void pushAtBottem(Stack <Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottem(s,data);
        s.push(top);
        
        


    }
    public static void main(String args[]){
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottem(s,6);

        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
    
}

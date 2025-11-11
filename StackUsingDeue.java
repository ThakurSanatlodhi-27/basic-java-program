import java.util.*;
import java.util.Stack;
public class StackUsingDeue {
    static class Stack{
        static Deque <Integer> q=new LinkedList<>();

        public static void push(int data){
            q.addLast(data);
        }
        public static int pop(){
            return q.removeLast();
        }
        public static int peek(){
            return q.getLast();
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
    
}

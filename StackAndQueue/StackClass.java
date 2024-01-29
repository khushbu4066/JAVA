package StackAndQueue;

import java.util.*;

public class StackClass {
    
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //Push 
        public static void push(int data){
            list.add(data);
        }

        //POP
        public static  int pop(){
            if(isEmpty()){
                return -1;
            }
             int top = list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(9);
        s.push(7);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}

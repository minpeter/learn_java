package Etc;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(1024);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
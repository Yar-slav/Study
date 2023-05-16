package com.example.leetcode;

import java.util.Stack;

class ImplementQueueUsingStacks {

    private int elementInMemory;
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public ImplementQueueUsingStacks() {
    }

    public void push(int x) {
        if(stack1.isEmpty()) {
            elementInMemory = x;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        int result = stack1.pop();
        if(!stack1.empty()) {
            elementInMemory = stack1.peek();
        }
        return result;
    }

    // element is kept in constant memory and is modified when we push or pop an element.
    public int peek() {
        return elementInMemory;
    }

    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

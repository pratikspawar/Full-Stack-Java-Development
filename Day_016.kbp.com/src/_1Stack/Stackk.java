package _1Stack;

import java.util.Stack;

public class Stackk {
public static void main(String[] args) {
	Stack stack=new Stack();
	stack.push(100);
	stack.push(200);
	stack.push(300);
	stack.push(400);
	
	System.out.println(stack);
	stack.pop();
	
	
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.empty());
	System.out.println(stack.search(100));
}
}

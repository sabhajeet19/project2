package pkg;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("agra");
		st.push("faizabad");
		st.push("delhi");
		st.push("noida");
		System.out.println("Stack: "+st);
		String topElement = st.peek();
		System.out.println(topElement);
		System.out.println(st.pop());
		System.out.println("Stack: "+st);
		String s= st.pop();
		

	}

}

package basicExercices;

import java.util.Stack;

public class MatchingParenthesis {

	public static boolean CheckParenthesis(String string) {
		
		// if string is empty there are no parenthesis to check for so it returns true;
		
		if (string.isEmpty()) {
			return true;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		// we parse the string
		
		for (int i = 0; i < string.length(); i++) {
		
		// set current character read at where the iterator's current position is.	
			
			char current = string.charAt(i);
			
		// check for open parenthesis and if found push them onto the stack	
			
			if (current == '{' || current == '(' || current == '[') {
				stack.push(current);
			}
			
		// check for closed parenthesis and if found push them onto the stack	
			
			if (current == '}' || current == ')' || current == ']') {
				if (stack.isEmpty()) 
					return false;
		
		// peek at last character from available in the stack
				
				char last = stack.peek();
		
		// check if the current character (from the end section of the stack) is a closing parenthesis
		// and the character from the first section of the stack is an opening parenthesis and remove them with pop().
				
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					stack.pop();
				else
					return false;
			}
		}
		
		// again after all the operations are done and the parenthesis found their match 
		// and were successfully removed from the stack, the final condition would be that the stack is empty
		// and if so, return the empty stack.
		
		return stack.isEmpty();
		
	}
	
}

package com.vacker.example.tricky_progs;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static void main(String[] args) {
		char [] input = {'[', '[', '{', '}', ']', ']'};
		System.out.println("Is expresseion balanced ::: "+isBalanced(input));
		
	}

	public static Boolean isBalanced(char[] input) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length; i++) {
			Character paranthesis = input[i];
			if(paranthesis.equals('(')||paranthesis.equals('{')||paranthesis.equals('[')) {
				stack.push(paranthesis);
			} else {
				if(paranthesis.equals(')')||paranthesis.equals('}')||paranthesis.equals(']')) {
					if(stack.isEmpty())
						return false;
					if(!isMatching(paranthesis, stack.pop()))
						return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static boolean isMatching(Character input, Character stackParen) {
		if(input.equals(')') && stackParen.equals('('))
				return true;
		if(input.equals('}') && stackParen.equals('{'))
				return true;
		if(input.equals(']') && stackParen.equals('['))
				return true;
		return false;
	}
}

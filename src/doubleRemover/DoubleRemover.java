package doubleRemover;

import java.util.Stack;

public class DoubleRemover {
    public String removeDuplicates(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (stack.isEmpty()) { //isEmpty == 0 elements
                stack.push(temp);
            } else {
                char top = stack.peek();
                if (temp == top) {
                    stack.pop();
                } else {
                    stack.push(temp);
                }
            }
        }
        // dc -> c top

        StringBuilder sb = new StringBuilder();
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//        return sb.reverse().toString();
        //либо второй вариант
        for (Character temp : stack) {
            sb.append(temp);
        }
        return sb.toString();
    }
}


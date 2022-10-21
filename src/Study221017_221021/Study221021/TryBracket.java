package Study221017_221021.Study221021;

import java.util.Stack;

public class TryBracket {
    Stack<String> stack = new Stack<>();

    public boolean solution(String s) {

        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
            return false;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {

                case '(':
                    stack.push("\\(");
                    break;
                case '{':
                    stack.push("\\{");
                    break;
                case '[':
                    stack.push("\\[");
                    break;
                case ')':
                    if (stack.contains('(')) stack.pop();
                    break;
                case '}':
                    if (stack.contains('{')) stack.pop();
                    break;
                case ']':
                    if (stack.contains('[')) stack.pop();
                    break;
                default:
                    return false;

            }

        }
        return stack.size() == 0;
    }


}

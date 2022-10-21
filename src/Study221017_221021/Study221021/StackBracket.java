package Study221017_221021.Study221021;

import java.util.Stack;

public class StackBracket {

    public boolean solution(String s){
        Stack<String> stack = new Stack<>();

            for(int i = 0; i < s.length() ; i++) {
               if (s.charAt(i) == '(')
                   stack.push("\\(");
                else if(s.charAt(i) == ')')
                   stack.pop();
            }
        return stack.size() == 0;
    }


}

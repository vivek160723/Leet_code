class Solution {
    public boolean isValid(String s) {
        if(s==null){
            return false;
        }
      Stack<Character> stack=new Stack<>();
       for (char c : s.toCharArray()) {
        if(c=='('||c=='{'||c=='['){
            stack.push(c);
       }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
            stack.pop();
       }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
        stack.pop();
       }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
        stack.pop();
       }else {
        return false;
       }
       }
    return stack.isEmpty();
}}
// if we get the stack empty it means it is the correct parenthesis

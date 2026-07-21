class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String i:tokens){
            
            if(i.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(i.equals("*")){
                 stack.push(stack.pop()*stack.pop());
            }
            else if (i.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (i.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            }else{
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();

    }
}
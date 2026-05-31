class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
                if (s.substring(i, i+1).equals("(")){
                    stack.push(")");
                }
                else if (s.substring(i, i+1).equals("{")){
                    stack.push("}");
                }
                else if (s.substring(i, i+1).equals("[")){
                    stack.push("]");
                }
            
                
            
            else{
                if (stack.isEmpty() || !s.substring(i, i+1).equals(stack.pop())){
                    return false;
                }
            }

        
        }
        return stack.isEmpty();
    }
}

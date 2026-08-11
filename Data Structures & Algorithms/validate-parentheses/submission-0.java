class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );
        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch)){
                stack.push(ch);
            } else {
                if(stack.isEmpty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

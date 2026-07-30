class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int current;
        int currentTwo;
        for(String num : operations) {
            if(!stack.isEmpty() && num.equals("C")){
                stack.pop();
            } else if (!stack.isEmpty() && num.equals("D")) {
                current = stack.pop();
                stack.push(current);
                stack.push(current * 2);
            } else if (stack.size() > 1 && num.equals("+")){
                current = stack.pop();
                currentTwo = stack.pop();
                stack.push(currentTwo);
                stack.push(current);
                stack.push(currentTwo + current);
            } else if (num.equals("D") || 
                        num.equals("C") ||
                        num.equals("+")){
                            //
            } else {
                stack.push(Integer.valueOf(num));
            }
        }
        int summ = 0;
        while(!stack.isEmpty()){
            summ += stack.pop();
            System.out.println(summ);
        }
        return summ;
    }
}
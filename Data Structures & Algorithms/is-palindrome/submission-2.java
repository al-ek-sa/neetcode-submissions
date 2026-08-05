class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 2){
            return true;
        }
        String result = 
            s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.print(result);
        for(int i = 0; i < result.length()/2; i++){
            if(result.charAt(i) != result.charAt(result.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

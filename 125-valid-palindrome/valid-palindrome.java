class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char chs=s.charAt(start);
            char che=s.charAt(end);
            if(Character.isLetterOrDigit(chs)==false) start++;
            else if(Character.isLetterOrDigit(che)==false) end--;
            else if(Character.toLowerCase(chs)!=Character.toLowerCase(che)) return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
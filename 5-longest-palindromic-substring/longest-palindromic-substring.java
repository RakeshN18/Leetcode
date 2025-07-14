class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int maxi=0;
        String longeststring="";
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                String sub=s.substring(i,j+1);
                boolean ispalindrome =isPalindromeeff(sub);
                if(ispalindrome){
                    if(maxi<sub.length()){
                        maxi=Math.max(maxi,sub.length());
                        longeststring=sub;
                    }
                }
            }
        }
        return longeststring;
        
    }

    static boolean  isPalindromeeff(String str){
        int left=0,right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}
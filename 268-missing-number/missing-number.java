class Solution {
    public int missingNumber(int[] nums) {
        int range=nums.length+1;
        int sum=0;
        int sumnums=0;
        int missing=0;
        for(int i=0;i<range;i++){
            sum+=i;
        }
        for(int i=0;i<range-1;i++){
            sumnums+=nums[i];

        }
        missing=sum-sumnums;
        return missing;

        
    }
}
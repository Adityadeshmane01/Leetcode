class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int sum=0;

        while(right<nums.length){
            sum+=nums[right];
            
            if(right-left+1==k){
                maxAvg=Math.max((double)sum/k,maxAvg);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return maxAvg;
    }
}
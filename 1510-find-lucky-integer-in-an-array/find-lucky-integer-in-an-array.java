class Solution {
    public int findLucky(int[] arr) {
        int[] nums=new int[501];
    for(int num:arr){
        nums[num]++;
    }

        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]==i){
                return i;
            }
        }
        return -1;
    }
}
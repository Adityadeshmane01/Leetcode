class Solution {
    public int findFirst(int start,int end,int[] nums,int target){
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }

    public int findLast(int start,int end,int[] nums,int target){
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int[] ans={-1,-1};

        ans[0]=findFirst(start,end,nums,target);
        ans[1]=findLast(start,end,nums,target);

        return ans;
    }
}
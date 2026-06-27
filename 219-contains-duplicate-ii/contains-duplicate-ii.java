class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        int right=0;
        HashSet<Integer> set=new HashSet<>();

        while(right<nums.length){
            
                if(set.contains(nums[right])){
                     return true;
                }
                set.add(nums[right]);
               
                if(set.size()>k){
                set.remove(nums[left]);
                left++;
                }
                  right++;
                 
            }
           
        return false;
    }
}
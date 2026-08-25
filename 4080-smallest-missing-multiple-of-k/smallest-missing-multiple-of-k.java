class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        boolean flag=false;
        int i=1;
        while(!flag){
            if(!set.contains(k*i)){
                ans=k*i;
                flag=true;
                break;
            }
            i++;
        }
        return ans;
    }
}
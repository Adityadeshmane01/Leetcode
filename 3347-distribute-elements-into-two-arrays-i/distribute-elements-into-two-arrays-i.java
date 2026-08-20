class Solution {
    public int[] resultArray(int[] nums) {
        if(nums.length<3){
            return nums;
        }
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

         int k=0;
         int l=0;
        
        l1.add(nums[0]);
        l2.add(nums[1]);
       

        for(int i=2;i<nums.length;i++){
           if(l1.get(k)>l2.get(l)){
            l1.add(nums[i]);
            k++;
           }
           else{
            l2.add(nums[i]);
            l++;
           }
        }
        l1.addAll(l2);
        int[] ans=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            ans[i]=l1.get(i);
        }
        return ans;
    }
}
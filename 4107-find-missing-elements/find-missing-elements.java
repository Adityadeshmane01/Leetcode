class Solution {
    int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int num:arr){
            min=Math.min(num,min);
        }
        return min;
    }

    int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(num,max);
        }
        return max;
    }

    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();

        int min=findMin(nums);
        int max=findMax(nums);

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list;

    }
}
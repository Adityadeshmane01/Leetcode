class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        int n=nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }
        if(piv==-1){
            int k=0;
            int l=n-1;
            while(k<=l){
               int temp=nums[k];
            nums[k]=nums[l];
            nums[l]=temp;
            k++;
            l--; 
            }
            return;
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[piv]){
                int temp=nums[i];
                nums[i]=nums[piv];
                nums[piv]=temp;
                break;
            }
        }
        int i=piv+1;
        int j=n-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
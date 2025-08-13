public class EvenDigits {
    static boolean IsEven(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,22,3456,3,123,4561};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(IsEven(nums[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}

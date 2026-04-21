public class practiceMaxSum {
    public static void main(String[] args) {
        int[] arr= {2,1,4,2,5,6};
        int k=5;
        int sum=0;
        int maxSum=0;for(int i=0;i<=arr.length-k;i++){
                for (int j = i; j < i + k; j++) {
                sum+=arr[j];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
                sum=0;
        }
        System.out.println(maxSum);
    }
}
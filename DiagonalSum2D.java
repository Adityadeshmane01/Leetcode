public class DiagonalSum2D {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3,1},
            {4,5,6,1},
            {7,8,9,1},
            {10,11,12,1}
        };
        int sum=0;
        int n=mat.length;
       for(int i=0;i<mat.length;i++){
           sum=sum+mat[i][i];  // this will give the sum of primary diagonal
           sum=sum+mat[i][n-1-i]; // sum of secondary diagonal
       }
       if(n%2==1){
           sum-=mat[n/2][n/2];
       }
        System.out.println(sum);
    }

}

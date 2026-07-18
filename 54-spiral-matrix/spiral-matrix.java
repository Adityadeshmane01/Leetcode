class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int rowBegin=0;
        int rowEnd=matrix.length-1;
        
        int colBegin=0;
        int colEnd=matrix[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){

            for(int col=colBegin;col<=colEnd;col++){
                list.add(matrix[rowBegin][col]);
            }
            rowBegin++;

            for(int row=rowBegin;row<=rowEnd;row++){
                list.add(matrix[row][colEnd]);
            }
            colEnd--;

            if(rowBegin<=rowEnd){
                for(int col=colEnd;col>=colBegin;col--){
                    list.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }

            if(colBegin<=colEnd){
                for(int row=rowEnd;row>=rowBegin;row--){
                    list.add(matrix[row][colBegin]);
                }
                colBegin++;
            }
        }
        return list;
    }
}
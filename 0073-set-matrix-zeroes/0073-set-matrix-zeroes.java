class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[]rowarr = new int[row];
        int[]colarr = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rowarr[i]=1;
                    colarr[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(colarr[j]==1 || rowarr[i]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
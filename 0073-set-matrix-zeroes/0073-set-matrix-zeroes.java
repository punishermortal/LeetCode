// hey people one of the bruteforce method is as usual came in mind simple traverse the matrix and where you get zero there traverse that row and column and set there -1 and while setting -1 leave that places where zero is already after setting -1 again traverse the matrix and set 0 at the place of -1
// time complexity is O((m*n)*(n+m))


// another optimize way of doing that problem is below

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //create a  array for tracking zero while traversing a matrix,in this array we
        // store in which row of matrix zero is present same way we do for a column
        int[]rowarr = new int[row];
        int[]colarr = new int[col];
        //traverse a matrix and fill the row and column array
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
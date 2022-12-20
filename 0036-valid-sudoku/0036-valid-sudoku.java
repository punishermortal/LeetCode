class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                //if we get '.' then we skip ,we didnot check for it
                if(board[i][j] !='.'){
                    //if tino valid then we skip not return false here
                    if(!isValidRow(board,i,j) || !isValidCol(board,i,j) || !isValidBox(board,i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    //this function is checking for a row
    public boolean isValidRow(char[][]arr,int row,int col){
        //here catch is we are checking for a row so we keep constant col and changing row 
        //another thing is when we get j==row we skip that matrix/arr index for check
        char val=arr[row][col];
        for(int j=0;j<9;j++){
            if(j!=row && val==arr[j][col]){
                return false;
            }
        }
        return true;
    }
    //checking for a column
    public boolean isValidCol(char[][]arr,int row,int col){
        char val=arr[row][col];
         //here catch is we are checking for a column so we keep constant row and changing column 
        //another thing is when we get i==column we skip that matrix/arr index for check
        for(int i=0;i<9;i++){
            if(i!=col && val==arr[row][i]){
                return false;
            }
        }
        return true;
    }
    //thats a function for checking a 3*3 matrix 
    public boolean isValidBox(char[][]arr,int row,int col){
     //   first we find m,n which is the index of checking for given matrix
        int m=(row/3)*3;
        int n=(col/3)*3;
        char val=arr[row][col];
        //simple apply  a nested loop and check for it
        for(int i=m;i<m+3;i++){
            for(int j=n;j<n+3;j++){
                if((i!=row || j!=col) && val==arr[i][j]){
                    System.out.println("bow"+arr[i][j]);
                    return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        
        //this is for transpose of a matrix every row become column and vice versa
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(arr,i,j);
            }
        }
        //in this for loop we simply reverse every row
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
    }
    // create a function for swaping two no in a given matrix
    public void swap(int[][]arr,int i,int j){//
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}
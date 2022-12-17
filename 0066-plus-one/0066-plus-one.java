class Solution {
    public int[] plusOne(int[] digits) {
        //traversing digits from last
        for(int i=digits.length-1;i>=0;i--){
            //if we get no less than 9 from last that palce we add 1 and return
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        //creating a new arr updating a value
        int[]arr=new int[digits.length+1];
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=digits[i-1];
        }
        return arr;
        
        //we can also do this in that was
        // digits = new int[digits.length + 1];
        // digits[0] = 1;
        // return digits;
        
    }
}
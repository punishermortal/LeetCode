//Approch---->[1] It will give a tle afer n=43 because
//time complexity of this solution is 2^n

//sp we can use dp here and mempize it then we can pass 
class Solution {
    //create a static function for storing ans
    int ans=0;
    public int climbStairs(int n) {
        // ans=0;
        // //create autily function which call a recursion and count ans for us
        // utilityClimb(n);
        // return ans;
        return dpClimb(n);
        
        //return fibClimbSolution(n);
    }
    public void utilityClimb(int n){
        //that is the base case when n==0 its increse one to our ands
        if(n==0){
            ans++;
        }
        //call the function if n>=1
        if(n>=1){
            utilityClimb(n-1);
        }
        if(n>=2){
            utilityClimb(n-2);
        }
    }
    
    //Approch---->2 its a simple fibonaci we have to calculate nth fibonacci
    public int fibClimbSolution(int n){
         //at fib series 1st element is 0 and 2nd is 1
        int n1=0;
        int n2=1;
        //and every element is sum odf previous 2 element
        int n3=n1+n2;
        //calculate nth fib no
        for(int i=0;i<n;i++){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }
    
    //Approch---->3 dp with memoization 
    int[]dp=new int[46];
    public int dpClimb(int n){
        if(n==1){
            dp[1]=1;
        }
        if(n==2){
            dp[2]=2;
        }
        if(dp[n] > 0){
            return dp[n];
        }
        return dp[n]=dpClimb(n-1)+dpClimb(n-2);
    }
}


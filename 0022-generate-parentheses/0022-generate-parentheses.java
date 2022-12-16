class Solution {
    public List<String> generateParenthesis(int n) {
        String ans="";
        //if n=3 thats mean we have 3 open and 3 close bracket so we create it
        int open=n;
        int close=n;
        //creat a arraylist for storing ans
        List<String>list=new ArrayList<>();
        //call a utilit function which helps us to find ans
        generateUtility(open,close,ans,list);
        return list;
    }
    public void generateUtility(int open,int close,String ans,List<String> list){
        //that is the base condition when open and clsoe both are remain 0
        if(open==0 && close==0){
            list.add(ans);
        }
        //open will be added to ans till it remain
        if(open!=0){
            String ans1=ans;
            ans1+="(";
            generateUtility(open-1,close,ans1,list);
        }
       // when open is not presen and if we put close our string will be invalid
        if(close > open){
            String ans2=ans;
            ans2+=")";
            generateUtility(open,close-1,ans2,list);
        }
        return;
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        //a=0,b=1,c=2......z=25
        //range of digits,lets suppose digit=3 range of 3 
        //is(3,5)===((digit-2)*3=3 ,((digit-1)*3)-1=5)
        //lets digit=5, so rnge will be(9,11) that will be
        //((digit-2)*3=9,((digit-1)*3)-1=11)
        
        List<String>ans=new ArrayList<>();
        //edge case if string is empty we have to sent empty string so 
        //take care of it from outside
        if(digits.length()==0){
            return ans;
        }
        letterComboUtility("",digits,ans);
        return ans;
        
    }
    public void letterComboUtility(String p,String up,List<String>list){
        //that is the base case when unprocess string will be empty add ans and return
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        //take first char from string and after sub 0 from it will be change into int
        int ch=up.charAt(0)-'0';
        //lets handle for 9 from another case because ay digit 9 there are
        //4 character and in case of 8 order will be change so 
        //handle in other side
        if(ch!=9 && ch!=7 && ch!=8){
            for(int i=(ch-2)*3;i<(ch-1)*3;i++){
            //from the range of digit convert it into a character
                char chh=(char)('a'+i);
                letterComboUtility(p+chh,up.substring(1),list);
            }
        }else if(ch==7){
            for(int i=(ch-2)*3;i<=(ch-1)*3;i++){
            //from the range of digit convert it into a character
                char chh=(char)('a'+i);
                letterComboUtility(p+chh,up.substring(1),list);
            }
        }else if(ch==8){
           for(int i=((ch-2)*3)+1;i<=(ch-1)*3;i++){
            //from the range of digit convert it into a character
                char chh=(char)('a'+i);
                letterComboUtility(p+chh,up.substring(1),list);
            } 
        }else if(ch==9){
            for(int i=((ch-2)*3)+1;i<=((ch-1)*3)+1;i++){
            //from the range of digit convert it into a character
                char chh=(char)('a'+i);
                letterComboUtility(p+chh,up.substring(1),list);
            }
        }
        
    }
}
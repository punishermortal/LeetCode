class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        int ns = s.length();
        int nt = t.length();
        if(ns>nt)return false;
        while(sp<ns && tp<nt){
            if(t.charAt(tp)==s.charAt(sp)){
                sp++;
            }
            tp++;
        }
        return sp==ns;
    }
}
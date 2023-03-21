class Solution {
    public String longestPalindrome(String s) {
        char ch[] = s.toCharArray();
        String str = Character.toString(ch[0]);
        int len = 0;
        int n = s.length();
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            arr[i][i] = 1;
            
        }
        for(int i = 0 ; i < n-1 ; i++){
            if(ch[i]==ch[i+1]){
                arr[i][i+1]=1;
                if(((i+1)-i)>len){
                    len = (i+1)-i;
                    str = s.substring(i,i+2);
                }
            }
        }
        for(int i = 0 ; i < n-2 ; i++){
            if(ch[i]==ch[i+2]){
                arr[i][i+2]=1;
                if(((i+2)-i)>len){
                    len = 3;
                    str = s.substring(i,i+3);
                }
            }
        }
        for(int i = 0 ; i < n-3 ; i++){
            if(ch[i]==ch[i+3] && ch[i+1]==ch[i+2]){
                arr[i][i+3]=1;
                str = s.substring(i,i+4);
            }   
        }
        for(int i = 4 ; i < n ; i++){
            for(int j = 0 ; j < n-i ; j++){
                if(ch[j]==ch[i+j]){
                    if(arr[j+1][(j+i)-1]==1){
                        arr[j][j+i]=1;
                        if(i>len){
                            len = i;
                            str = s.substring(j,(i+j)+1);
                        }
                    }
                }
            }
        }
        return str;
    }
}
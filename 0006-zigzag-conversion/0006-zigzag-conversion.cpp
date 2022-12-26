class Solution {
public:
    string convert(string s, int n) {
        string a[n];
        int i,j=0,pos=0;
        if(n==1)return s;
      for(i=0;i<s.length();++i){
        a[pos]+=s[i];
          if(pos==0)j=0;else if(pos==n-1) j=1;
          if(j==0)++pos;else --pos;
      }  
      for(i=1;i<n;++i)a[0]+=a[i];
      return a[0];
    }
};
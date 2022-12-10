class Solution {
    public int romanToInt(String s) {
        int sum=0;
        //create a map and store the vale of roman words
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int n=s.length();
        //iterate on string and get value of respected roman words from map
        for(int i=0;i<n;i++){
            //condition when prefreance of succesor is greater then we ubtract from ans
            if(i+1<n && hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
                sum-=hm.get(s.charAt(i));
            }else{//otherwise we add to sum
                sum+=hm.get(s.charAt(i));
            }
        }
        return sum;
    }
}
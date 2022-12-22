class Solution:
    def reverseWords(self, s: str) -> str:
        #split methodis used for removing whitespaces from starting 
        #and end oa a string
        s=s.strip()
        #string's word is converted into list by split method
        lis=list(s.split())
        # reverse the list by using slicing method
        lis=lis[::-1]
        # ater reversing join the list by using join method
        return " ".join(lis)
class Solution:
    def mySqrt(self, x: int) -> int:
        #simple apply a binary search ,lets start=0 and end 
        #will be x and in place of target=mid*mid
        start=0
        end=x
        while(start <= end):
            mid=start+(end-start)//2
            #checking for getting perfect square root
            if(mid*mid==x):
                return mid
            elif(mid*mid>x):
                end=mid-1
            else:
                start=mid+1
        # we have to return floor of a root so when loop will be 
        #terminated then our end comes befor mid so we return end
        return end
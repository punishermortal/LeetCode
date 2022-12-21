class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        start = 1
        val=nums[0]
        for i in range(1,len(nums)):
            if (nums[i]!=val):
                nums[start]=nums[i]
                val=nums[start]
                start+=1
        return start
   
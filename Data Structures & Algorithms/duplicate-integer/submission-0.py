class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        c=0
        for i in range(len(nums)):
            for j in range(len(nums)):
                if(nums[i]==nums[j] and i!=j):
                    c=1
        if c==1:
            return "true"
        else:
            return "false"


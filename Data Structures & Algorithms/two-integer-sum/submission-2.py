class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashtable={}
        for i,n in enumerate(nums):
            if target-nums[i] in hashtable:
                return [hashtable[target-nums[i]],i]
            hashtable[n]=i
        return []

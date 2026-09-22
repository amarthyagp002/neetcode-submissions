class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count1={}
        list2=[[] for i in range(len(nums)+1)]
        list3=[]
        for i in nums:
            count1[i]=1+count1.get(i,0)
        for i,c in count1.items():
            list2[c].append(i)
        for i in range(len(list2)-1,0,-1):
            for j in list2[i]:
                list3.append(j)
                if len(list3) == k:
                    return list3
                




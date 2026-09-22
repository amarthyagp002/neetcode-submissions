class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        list1=[]
        list2=[]
        list3=[0]*len(strs)
        f=0
        for i in range(len(strs)):
            c=sorted(strs[i])
            if list3[i] !=1:
                for j in range(i,len(strs)):
                    if c==sorted(strs[j]):
                        f=1
                        list1.append(strs[j])
                        list3[j]=1
            if f==1:
                list2.append(list1)
                list1=[]
            f=0
        return list2

            
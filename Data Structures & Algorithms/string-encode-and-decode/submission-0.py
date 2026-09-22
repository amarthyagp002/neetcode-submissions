class Solution:

    def encode(self, strs: List[str]) -> str:
        s=""
        for i in strs:
            for j in i:
                s=s+chr(ord(j)+1)
            s=s+'#'
        return s

    def decode(self, s: str) -> List[str]:
        k=""
        st=[]
        for i in s:
            if i!='#':
                k=k+chr(ord(i)-1)
            else:
                st.append(k)
                k=""
        return st

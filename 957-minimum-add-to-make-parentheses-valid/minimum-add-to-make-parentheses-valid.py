class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        stk = []
        res=0
        for i in s:
            if i == ")" and len(stk)!=0:
                stk.pop()
            elif i == "(":
                stk.append(i)
            else:
                res += 1
        res += len(stk)
        return res

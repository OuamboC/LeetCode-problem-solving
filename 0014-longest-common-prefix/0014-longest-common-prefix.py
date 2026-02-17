class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = list()
        for i in range(min(len(s) for s in strs)): 
            for string in strs:
                if strs[0][i] == string[i]:
                    pass
                else:
                    return "".join(result)
            result.append(strs[0][i])
        return "".join(result)
        
            

        
                    
                
        
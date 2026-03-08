class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        result = defaultdict(list) # automatically creates [] for any new key
        for s in strs:
            key = tuple(sorted(s))
            result[key].append(s)
        
        return list(result.values())
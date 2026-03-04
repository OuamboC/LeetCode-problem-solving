class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        # Declare an empty dict called result
        result = {}
        # Loop through ransomNote and add all letter (character) to result by counting their occurence
        for c in ransomNote:
            result[c] = result.get(c,0) + 1
        # Loop through magazine
        for c in magazine:
             # If character in result
            if c in result:
                # Decrement the count of that character in result
                result[c] = result.get(c, 0) - 1
            else:
                pass
        # Check if result at magazine is empty, if it's the case, return True
        return all(val <= 0 for val in result.values())
        
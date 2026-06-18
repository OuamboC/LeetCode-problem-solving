class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        # Declare a variable to store numbers already seen
        seen = set()
        # Check membership
        for i in range(len(nums)):
            if nums[i] not in seen :
                seen.add(nums[i])
                if i >= k:
                    seen.remove(nums[i-k])
            else:
                return True
        return False 


        
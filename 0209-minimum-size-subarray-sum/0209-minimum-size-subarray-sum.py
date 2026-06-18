class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        # Start at the beginning
        left = 0
        # Start at the beignning
        right = 0
        # Initialse to 0
        current_sum = 0
        #Initialise to the infinity
        min_len = float('inf')
        while right < len(nums):
            if current_sum < target:
                # Add the new element to my sum
                current_sum += nums[right]
                # Move right forward
                right += 1
            while current_sum >= target:
                # Record the window lenght
                min_len = min(min_len, right - left)
                # Substract that number from my sum
                current_sum -= nums[left]
                # Move left forward
                left += 1
        return 0 if min_len == float('inf') else min_len

                
         
        
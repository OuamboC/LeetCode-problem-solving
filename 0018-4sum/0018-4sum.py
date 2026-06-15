class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        result = list()
        sorted_nums = sorted(nums) 
        for i in range(len(sorted_nums)):
            if i > 0 and sorted_nums[i] == sorted_nums[i - 1]:
                continue
            for j in range(i+1, len(sorted_nums) -1):
                if j > i + 1 and sorted_nums[j] == sorted_nums[j -1]:
                    continue
                left = j + 1
                right = len(nums) - 1
                while (left < right):
                        if sorted_nums[i] + sorted_nums[j] + sorted_nums[left] + sorted_nums[right] == target:
                            result.append([sorted_nums[i], sorted_nums[j], sorted_nums[left], sorted_nums[right]])
                            while(left < right and sorted_nums[left] == sorted_nums[left + 1]):
                                left = left + 1
                            while(left < right and sorted_nums[right] == sorted_nums[right - 1]):
                                right = right - 1
                            left = left + 1
                            right = right -1
                        elif sorted_nums[i] + sorted_nums[j] + sorted_nums[left] + sorted_nums[right] > target:
                            right = right -1
                        else:
                            left = left + 1
        return result


        
        
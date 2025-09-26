class Solution {
    public int[] buildArray(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= nums.length -1; i++){
            ans.add(nums[nums[i]]);

        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
class Solution {
     public int[] buildArray(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= nums.length -1; i++){
             int currentVal = nums[i];
             int targetVal = nums[currentVal];
             ans.add(targetVal);

        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
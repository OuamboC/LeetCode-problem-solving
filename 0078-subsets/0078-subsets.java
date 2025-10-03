class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void helper(int[] nums, int i, ArrayList<Integer> current, List<List<Integer>> result){
        //Base case
        if(i == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        // Go left by adding nums[i] to current 
        current.add(nums[i]);
        //Recurse with i+1 by adding nums[i];
        helper(nums, i+1, current, result);
        // Backtrack by removing nums[i] to current
        current.remove(current.size() - 1);
        // Go right without adding nums[i] 
        //Recurse without nums[i]
        helper(nums, i+1, current, result);
    }
}
class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> allSubsets = getAllSubsets(nums);
        int xorSum = 0;
        for(List<Integer> subset : allSubsets) {
            int xorVal = 0;
            for(int num : subset){
                xorVal ^= num;
            }
            xorSum  += xorVal;
        }
        return xorSum;
    }
    private List<List<Integer>> getAllSubsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void helper(int [] nums, int i, ArrayList<Integer> current, List<List<Integer>> result){
        
        if(i == nums.length){
            result.add(new ArrayList<>(current));
            return ;
        }
        //Choice 1: Going left of the root and left of each nodes by including nums[i]
        //Add nums[i] to current
        current.add(nums[i]);
        //Recurse with i+1 (move to next element)
        helper(nums, i+1, current, result); 
        //Backtrack(remove nums[i] from current)
        current.remove(current.size() - 1);

        //Choice 2:  Going right of the root and right of each nodes by excluding nums[i]
        //Recurse with i+1 without adding nums[i]
        helper(nums, i+1, current, result);
    
    }
}
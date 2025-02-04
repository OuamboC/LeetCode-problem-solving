class Solution{
    //Method to find two numbers that add up to the targer
    public int[] twoSum(int[] nums, int target){
        //Loop through each numbers in the array
        for(int i = 0; i<nums.length ; i++){
            //Loop through the remaining nymbers after the current number
            for (int j = i+1; j< nums.length; j++){
                //Check if the sum of the current pair equals the target
                if(nums[i]+nums[j] == target){
                    //return the indices of the two numbers
                    return new int[]{i, j};
                }
            }
        }
        //Return an empty array if no such pair is found 
        return new int[]{};
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> numbersFrequency = new HashMap<>();
        int[] result = new int [2];
        //Popularise numbersFrequency
        for(int i : nums){
            numbersFrequency.put(i, numbersFrequency.getOrDefault(i,0)+1);
        }
        int idx = 0;
        for( int key : numbersFrequency.keySet()){
            int value = numbersFrequency.get(key);
            int count = 2;
            if ( value == count){
                result[idx++] = key;
            }
        }
        return result;
        
    }
}
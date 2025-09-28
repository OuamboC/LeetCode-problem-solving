class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for( int i = 0; i < words.length ; i++){
            HashSet<Character> mySet = new HashSet<>();
            String word = words[i];
            for(int j = 0; j < word.length(); j++){
                char c = word.charAt(j);
                mySet.add(c);
            }
            if(mySet.contains(x)){
                result.add(i);
            }
        }
        return result;
        
    }
}
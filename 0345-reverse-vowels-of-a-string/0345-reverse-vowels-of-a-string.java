class Solution {
    public String reverseVowels(String s) {
        //Create a stack to store each character of a given string
        Stack<Character> myStack = new Stack<>();

        //Create a String to store the alphabetical vowels ( lower and Upper Case)
        String vowels = "aeuioAEUIO";
        //Create a HashSet to store each character of vowels
        HashSet<Character> myVowels = new HashSet<>();
        //Loop though the vowels to populate myHashSet
        for( char c: vowels.toCharArray()) {
            myVowels.add(c);
        }
        //Loop through a given string to check if any vowels
        for(int i = 0 ; i < s.length(); i++){
            char currentChar = s.charAt(i);
            /**
             * If the current char is a vowel ( this is checking the set using 'contains')
             * then as the char to the stack ( remember it goes in order a e u i o)
             */
            if(myVowels.contains(currentChar)){
                myStack.push(currentChar);
            }
        }
        /**
         * Ad the method returns a string not a char
         * and because in java strings are immutable ( cannot be changed directly)
         * we will make a char array ( which can be changed directly by index )
         * and then we will convert that to a string and return.
         */
        char[] result = s.toCharArray();
        //Loop through the array result
        for(int i = 0 ; i < result.length; i++){
            if(myVowels.contains(result[i])){
                result[i] = myStack.pop();
            }
        }
        return String.valueOf(result);
        
    }
}
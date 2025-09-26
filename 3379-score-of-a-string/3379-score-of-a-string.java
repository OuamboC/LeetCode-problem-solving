class Solution {
    public int scoreOfString(String s){
        int score = 0;

        LinkedHashMap <Character, Integer> charactersAndAscii = new LinkedHashMap<>();
            for (int i = 0; i < s.length(); i++){

                char c = s.charAt(i);
                int ascii = (int)c;

                charactersAndAscii.put(c,ascii);
            }
            for(int i = 0; i < s.length() - 1; i++){
                char currentChar = s.charAt(i);
                char nextChar = s.charAt(i+1);

                int currentAscii = charactersAndAscii.get(currentChar);
                int NextAscii = charactersAndAscii.get(nextChar);

                score +=Math.abs(currentAscii -NextAscii);
            }
        System.out.println(charactersAndAscii);
        return score;
    }
       

        
}
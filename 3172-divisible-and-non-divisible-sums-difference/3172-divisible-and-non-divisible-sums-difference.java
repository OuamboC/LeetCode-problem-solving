class Solution {
    public int differenceOfSums(int n, int m){
        HashSet<Integer> nonDivisibleNumber = new HashSet<>();
        HashSet<Integer> DivisibleNumber = new HashSet<>();
        int num1 = 0;
        int num2 = 0;
        int diff = 0;
        for(int i =1; i<=n; i++){
            if(i %m != 0 ){
                nonDivisibleNumber.add(i);
            }else{
                DivisibleNumber.add(i);
            }
        }
        for (int key : nonDivisibleNumber ){
            num1+= key;
        }
        for (int key : DivisibleNumber ){
            num2+= key;
        }
        diff = num1 - num2;
        return diff;
    }
}
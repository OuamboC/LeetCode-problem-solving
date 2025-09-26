class Solution {
    public int differenceOfSums(int n, int m){
        //Create an ArrayList to store numbers which are divisible by m 
        ArrayList <Integer> divisibleNumbers = new ArrayList<>();
        //Create an ArrayList to store numbers which are not divisible by m 
        ArrayList <Integer> nonDivisibleNumbers = new ArrayList<>();
        //Initialise the num1 to 0
        int num1 = 0;
        //Initialise the num1 to 0
        int num2 = 0;
        // Loop through n by respecting that the range [1,n] is inclusive
        for( int i =1; i<= n; i++){
            if(i % m != 0){
                 nonDivisibleNumbers.add(i);
            }else{
                divisibleNumbers.add(i);

            }
        }
        System.out.println(nonDivisibleNumbers);
        System.out.println(divisibleNumbers);
        for(int num : nonDivisibleNumbers){
            num1+=num;
        }
        for(int num : divisibleNumbers){
            num2+=num;
        }
        return num1 - num2;


    }
}
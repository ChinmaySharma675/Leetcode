// Last updated: 3/7/2026, 10:36:04 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> SS=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%15==0)SS.add("FizzBuzz");
            else if(i%3==0)SS.add("Fizz");
            else if(i%5==0)SS.add("Buzz");
            else SS.add(String.valueOf(i));
        }
        return SS;
        
    }
}
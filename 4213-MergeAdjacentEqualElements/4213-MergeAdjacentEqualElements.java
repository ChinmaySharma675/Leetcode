// Last updated: 3/7/2026, 10:33:32 PM
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> L=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            long current = nums[i];

             //Merges with the last element in L if equal
            while (!L.isEmpty() && L.get(L.size() - 1) == current) {
                current = L.remove(L.size() - 1) + current;//removes last element of L and adds new merged el to it.
            }

            // Add the (possibly merged) current value
            L.add(current);
        }

             return L;     
    }
}
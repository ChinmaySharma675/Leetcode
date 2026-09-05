// Last updated: 9/5/2026, 7:27:38 PM
class Solution {
    public String reversePrefix(String s, int k) {
        int j=k-1;
        char[] array=s.toCharArray();
        for(int i=0;i<k/2;i++){
            char temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            j--;
        }
        return new String(array);
    }
}
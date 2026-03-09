// Last updated: 3/9/2026, 5:04:14 PM
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
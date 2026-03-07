// Last updated: 3/7/2026, 10:35:11 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        for(int i=0;i<indices.length;i++){
           arr[indices[i]]=s.charAt(i);
        }
        return new String(arr);
    }
}
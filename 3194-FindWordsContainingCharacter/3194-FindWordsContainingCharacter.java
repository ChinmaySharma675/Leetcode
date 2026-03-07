// Last updated: 3/7/2026, 10:34:21 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> L=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1) L.add(i);
        }
        return L;
        
    }
}
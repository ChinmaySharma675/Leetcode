// Last updated: 3/7/2026, 10:33:34 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> L=new ArrayList<>();
        for(int i=0;i<bulbs.size();i++){
            int c=0;
            for(int j=0;j<bulbs.size();j++){
                if(bulbs.get(i).equals(bulbs.get(j))){
                    c++;
                }
            }
            if(c%2!=0 && !L.contains(bulbs.get(i))){
                L.add(bulbs.get(i));
            }
        }
        Collections.sort(L);
        return L;
    }
}
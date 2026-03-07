// Last updated: 3/7/2026, 10:33:35 PM
class Solution {
    public String reverseByType(String s) {
        StringBuilder letters=new StringBuilder();
        StringBuilder specialC=new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                letters.append(c);
            } else{
                specialC.append(c);
            }}
            letters.reverse();
            specialC.reverse();
             StringBuilder finalS=new StringBuilder();
            int i1=0;
            int i2=0;
            for(char c: s.toCharArray()){
                if(Character.isLowerCase(c)){
                    finalS.append(letters.charAt(i1++));
                } else{
                    finalS.append(specialC.charAt(i2++));
                }
            }
        return finalS.toString();
    }
}
// Last updated: 3/7/2026, 10:34:58 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        char C=coordinates.charAt(0);
        int d=coordinates.charAt(1);
        if((C=='a'||C=='c'||C=='e'||C=='g') && d%2!=0 ) return false;
        else if((C=='b'||C=='d'||C=='f'||C=='h') && d%2==0 ) return false;
        return true;
    }
}
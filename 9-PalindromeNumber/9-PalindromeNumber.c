// Last updated: 3/7/2026, 10:36:38 PM
bool isPalindrome( long int x) {
        if (x < 0) return false;  // Negative numbers are not palindromes
    
     long int original = x;
     long int reversed = 0;
    
    while (x != 0) {
      long  int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;
    }
    
    return original == reversed;
    
}
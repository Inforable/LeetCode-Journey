// Solusi 1 --> Langsung pake fungsi bawaan
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String forward = String.valueOf(x);
        String backward = new StringBuilder(forward).reverse().toString();

        System.out.println(forward);
        System.out.println(backward);
        System.out.println(forward.equals(backward));
        return forward.equals(backward);
    }
}

// Solusi 2 --> Build reversnya pake math
class Solution {
    public boolean isPalindrome(int x) {
        if ((x < 0) || ((x % 10 == 0 && x != 0))) return false;

        int forward = x;
        int backward = 0;
        
        while (x > 0) {
            backward = backward * 10 + (x % 10);
            x /= 10;
        }

        System.out.println(forward);
        System.out.println(backward);
        if (forward == backward) {
            return true;
        } else {
            return false;
        }
    }
}
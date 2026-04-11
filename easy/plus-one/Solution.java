class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] < 9) {
            digits[len - 1] += 1;
            return digits;
        }

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] % 10 == 0 && carry == 1) {
                digits[i] = 0;
                carry = 1;
            } else {
                carry = 0;
            }
        }

        if (digits[0] == 0 && carry == 1) {
            int[] newDigits = new int[len + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);

        while (n != 1 && n != 7) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            System.out.println(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }
}
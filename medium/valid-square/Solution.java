class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> st = new HashSet<>();

        st.add(getDistanceSquare(p1, p2));
        st.add(getDistanceSquare(p1, p3));
        st.add(getDistanceSquare(p1, p4));
        st.add(getDistanceSquare(p2, p3));
        st.add(getDistanceSquare(p2, p4));
        st.add(getDistanceSquare(p3, p4));

        return !st.contains(0) && st.size() == 2;
    }

    private int getDistanceSquare(int[] p1, int[] p2) {
        int deltaX = p2[0] - p1[0];
        int deltaY = p2[1] - p1[1];

        return (deltaX * deltaX) + (deltaY * deltaY);
    }
}
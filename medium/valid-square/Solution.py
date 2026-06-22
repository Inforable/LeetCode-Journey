class Solution:
    def validSquare(self, p1: List[int], p2: List[int], p3: List[int], p4: List[int]) -> bool:
        st = set()

        st.add(self.getDistanceSquare(p1, p2))
        st.add(self.getDistanceSquare(p1, p3))
        st.add(self.getDistanceSquare(p1, p4))
        st.add(self.getDistanceSquare(p2, p3))
        st.add(self.getDistanceSquare(p2, p4))
        st.add(self.getDistanceSquare(p3, p4))

        return (0 not in st) and (len(st) == 2)

    def getDistanceSquare(self, p1: List[int], p2: List[int]) -> int:
        return (p2[0] - p1[0])**2 + (p2[1] - p1[1])**2 
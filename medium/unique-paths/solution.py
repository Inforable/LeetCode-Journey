class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        a = m + n - 2
        b = min(a - (m - 1), m - 1)

        result = 1
        for i in range(1, b + 1) :
            result = result * (a - b + i) // i
        
        return result
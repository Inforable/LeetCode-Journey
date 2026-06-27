func uniquePaths(m int, n int) int {
    a := m + n - 2
    b := min(a - (m - 1), m - 1)

    var result int64 = 1

    for i := 1; i <= b; i++ {
        result = result * int64(a - b + i) / int64(i)
    }

    return int(result)
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}
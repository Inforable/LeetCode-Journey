func reportSpam(message []string, bannedWords []string) bool {
    bannedSet := make(map[string]bool)
    for _, word := range bannedWords {
        bannedSet[word] = true
    }

    count := 0

    for _, word := range message {
        if (bannedSet[word]) {
            count++
        }

        if (count >= 2) {
            return true
        }
    }

    return false
}
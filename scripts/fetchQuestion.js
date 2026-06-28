import { graphql } from "./graphql.js";

const query = `
    query getQuestionDifficulty($titleSlug: String!) {
        question(titleSlug: $titleSlug) {
            title
            titleSlug
            difficulty
        }
    }
`;

export async function getDifficultyQuestion(titleSlug) {
    const data = await graphql(query, {
        titleSlug: titleSlug,
    });

    return data.data.question;
}
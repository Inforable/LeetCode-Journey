import dotenv from "dotenv";
import { graphql } from "./graphql.js";

dotenv.config();

const query = `
query recentAcSubmissions($username: String!, $limit: Int!) {
    recentAcSubmissionList(username: $username, limit: $limit) {
        id
        title
        titleSlug
        timestamp
    }
}
`;

export async function getLatestSubmission() {
    const data = await graphql(query, {
        username: process.env.LEETCODE_USERNAME,
        limit: 1,
    });

    return data.data.recentAcSubmissionList[0];
}
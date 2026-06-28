import { graphql } from "./graphql.js";

const query = `
query submissionDetails($submissionId: Int!) {
    submissionDetails(submissionId: $submissionId) {
        code
        runtimeDisplay
        memoryDisplay
        lang {
            name
        }
        question {
            questionId
            titleSlug
        }
    }
}
`;

export async function getSubmissionDetail(submissionId) {
    const data = await graphql(query, {
        submissionId: Number(submissionId),
    },
    {
        "x-operation-name": "submissionDetails",
        Referer: `https://leetcode.com/submissions/detail/${submissionId}/`,
    }
    );

    return data.data.submissionDetails;
}
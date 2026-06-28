import { getLatestSubmission } from "./fetchLatest.js";
import { getSubmissionDetail } from "./fetchSubmission.js";
import { getDifficultyQuestion } from "./fetchQuestion.js";
import { saveSolution } from "./saveSolution.js";

const latest = await getLatestSubmission();

console.log("Latest:");
console.log(latest);

const submission = await getSubmissionDetail(latest.id);

console.log("Detail:");
console.log(submission);

const question = await getDifficultyQuestion(latest.titleSlug);

console.log("Difficulty");
console.log(question.difficulty);

await saveSolution(submission, question);
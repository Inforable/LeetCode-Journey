import fs from "node:fs/promises";
import path from "node:path";

const languageExtension = {
    javascript: "js",
    typescript: "ts",
    java: "java",
    python: "py",
    python3: "py",
    cpp: "cpp",
    c: "c",
    csharp: "cs",
    golang: "go",
    go: "go",
    kotlin: "kt",
    rust: "rs",
    swift: "swift",
    ruby: "rb",
    php: "php",
};

export async function saveSolution(submission, question) {
    const difficulty = (question?.difficulty ?? "unknown").toLowerCase();
    const languageName =
        submission?.language ??
        submission?.lang?.name ??
        "text";
    const extension = languageExtension[languageName.toLowerCase()] ?? "txt";

    const folderPath = path.join(
        process.cwd(),
        difficulty,
        question.titleSlug
    );

    await fs.mkdir(folderPath, {
        recursive: true,
    });

    const filePath = path.join(
        folderPath,
        `solution.${extension}`
    );

    try {
        await fs.access(filePath);

        console.log("Solution already exists.")
        return;
    } catch {
        
    }

    await fs.writeFile(
        filePath,
        submission.code,
        "utf-8"
    );

    console.log(`Saved -> ${filePath}`);
}
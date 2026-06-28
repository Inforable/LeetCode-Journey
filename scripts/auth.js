import dotenv from "dotenv";

dotenv.config();

export const headers = {
    Cookie: `LEETCODE_SESSION=${process.env.LEETCODE_SESSION}; csrftoken=${process.env.CSRFTOKEN}`,
    Referer: "https://leetcode.com",
    Origin: "https://leetcode.com",
    "Content-Type": "application/json",
    "x-csrftoken": process.env.CSRFTOKEN,
    Accept: "*/*",
    "User-Agent":
        "Mozilla/5.0",
    "x-requested-with": "XMLHttpRequest",
};
import axios from "axios";
import { headers } from "./auth.js"

const ENDPOINT = "https://leetcode.com/graphql";

export async function graphql(query, variables = {}, extraHeaders = {}) {
    const response = await axios.post(
        ENDPOINT,
        {
            query,
            variables,
        },
        {
            headers: {
                ...headers,
                ...extraHeaders,
            },
        }
    );

    return response.data;
}
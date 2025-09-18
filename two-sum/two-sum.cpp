#include <bits/stdc++.h>
using namespace std;

class Solution {
    public:
        vector<int> twoSum(vector<int>& nums, int target) {
            unordered_map<int, int> numMap; // Store (number, index)

            for (int i = 0; i < nums.size(); i++) {
                int complement = target - nums[i];

                if (numMap.count(complement) > 0) {
                    return {numMap[complement], i};
                }

                numMap[nums[i]] = i;
            }
            return {};
        }
};
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        const complementIdx = nums.indexOf(target - nums[i]);
        if (complementIdx >= 0 && complementIdx != i) {
            return [i, complementIdx];
        }
    }
    return [];
};
class Solution(object):
    def twoSum(self, nums, target):
        complement = {}
        for i in range(len(nums)):
            if (target - nums[i]) in complement:
                return [complement[target - nums[i]], i]
            complement[nums[i]] = i
        return []
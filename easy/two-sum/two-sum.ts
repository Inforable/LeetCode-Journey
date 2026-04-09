function twoSum(nums: number[], target: number): number[] {
    let complement: { [key: number]: number } = {};  

    for (let i = 0; i < nums.length; i++) {
        if (complement[target - nums[i]] != undefined) {
            return [complement[target - nums[i]], i];
        }
        complement[nums[i]] = i;
    }
    return [];
};
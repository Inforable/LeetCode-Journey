/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        } else if (nums.length == 0) {
            return null;
        }

        int mid = nums.length / 2;
        TreeNode result = new TreeNode(nums[mid]);

        int[] leftArray = Arrays.copyOfRange(nums, 0, mid);
        result.left = sortedArrayToBST(leftArray);

        int[] rightArray = Arrays.copyOfRange(nums, mid + 1, nums.length);
        result.right = sortedArrayToBST(rightArray);

        return result;
    }
}
package com.jun.plugin.leetcode.algorithm.no0102;

import java.util.*;

import com.jun.plugin.leetcode.algorithm.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        // 初始
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // 遍历
        while (!queue.isEmpty()) {
            List<Integer> result = new ArrayList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                // 求和
                TreeNode node = queue.poll();
                result.add(node.val);
                // 添加到 nodes 中
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            results.add(result);
        }

        return results;
    }

}

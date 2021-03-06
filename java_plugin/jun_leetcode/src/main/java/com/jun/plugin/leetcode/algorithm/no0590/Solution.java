package com.jun.plugin.leetcode.algorithm.no0590;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import com.jun.plugin.leetcode.algorithm.common.Node;

/**
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 *
 * 迭代
 */
public class Solution {

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> results = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            // 当前节点
            Node node = stack.pop();
            results.add(node.val);

            // 子节点
            if (node.children != null) {
                stack.addAll(node.children);
            }
        }

        Collections.reverse(results);
        return results;
    }

}

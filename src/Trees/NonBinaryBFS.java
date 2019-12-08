package Trees;

import java.util.*;

class Solution {

    /**
     * Traverses the tree in a breadth first search order. The result will be a list containing the key of each node in the correct order.
     *
     * @param tree - the tree that will be traversed
     * @return list containing the keys of each node in the correct order
     */
    public static List<Integer> bfs(Tree tree) {
        Queue<Tree> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        Tree current = tree;
        List<Tree> children = tree.getChildren();
        q.add(tree);
        while(!q.isEmpty()) {
            current = q.poll();
            result.add(current.getKey());
            children = current.getChildren();
            for(Tree child : children) {
                q.add(child);
            }
        }

        return result;

    }
}

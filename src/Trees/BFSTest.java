package Trees;

import static org.junit.Assert.*;

import java.util.*;
import java.util.stream.*;

import org.junit.*;

public class BFSTest {

    @Test
    public void testRootOnly() {
        Tree tree = new Tree(5);
        assertEquals(Arrays.asList(5), Solution.bfs(tree));
    }

    @Test
    public void testSomeChildrenHeightOne() {
        Tree tree = new Tree(42, Arrays.asList(new Tree(1), new Tree(2), new Tree(3), new Tree(4)));
        List<Integer> res = Solution.bfs(tree);
        assertEquals(5, res.size());
        Map<Integer, Integer> depthMap = new HashMap<>();
        depthMap.put(42, 0);
        depthMap.put(1, 1);
        depthMap.put(2, 1);
        depthMap.put(3, 1);
        depthMap.put(4, 1);
        int currentDepth = 0;
        for (int i = 0; i < res.size(); i++) {
            if (currentDepth != depthMap.get(res.get(i))) {
                currentDepth++;
            }
            assertEquals(currentDepth, (int) depthMap.get(res.get(i)));
        }
    }

    @Test
    public void testLine() {
        Tree tree = new Tree(0);
        Tree currentTree = tree;
        for (int i = 1; i <= 42; i++) {
            currentTree.addChildren(new Tree(i));
            currentTree = tree;
        }
        assertEquals(IntStream.range(0, 43).boxed().collect(Collectors.toList()), Solution.bfs(tree));
    }

    @Test
    public void testLargeTree() {
        Tree tree = new Tree(1, Arrays.asList(new Tree(2, Arrays.asList(new Tree(5, Arrays.asList(new Tree(14, Arrays.asList(new Tree(19))), new Tree(15), new Tree(16), new Tree(17))), new Tree(6), new Tree(7))), new Tree(3, Arrays.asList(new Tree(8), new Tree(9), new Tree(10))), new Tree(4, Arrays.asList(new Tree(11), new Tree(12), new Tree(13, Arrays.asList(new Tree(18)))))));
        List<Integer> res = Solution.bfs(tree);
        assertEquals(19, res.size());
        Map<Integer, Integer> depthMap = new HashMap<>();
        depthMap.put(1, 0);
        depthMap.put(2, 1);
        depthMap.put(3, 1);
        depthMap.put(4, 1);
        depthMap.put(5, 2);
        depthMap.put(6, 2);
        depthMap.put(7, 2);
        depthMap.put(8, 2);
        depthMap.put(9, 2);
        depthMap.put(10, 2);
        depthMap.put(11, 2);
        depthMap.put(12, 2);
        depthMap.put(13, 2);
        depthMap.put(14, 3);
        depthMap.put(15, 3);
        depthMap.put(16, 3);
        depthMap.put(17, 3);
        depthMap.put(18, 3);
        depthMap.put(19, 4);
        int currentDepth = 0;
        for (int i = 0; i < res.size(); i++) {
            if (currentDepth != depthMap.get(res.get(i))) {
                currentDepth++;
            }
            assertEquals(currentDepth, (int) depthMap.get(res.get(i)));
        }
    }
}

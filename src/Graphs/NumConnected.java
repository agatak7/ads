package Graphs;

import java.util.*;


public class NumConnected {

    public static int numberOfConnectedComponents(Graph g) {
        if(g == null) return 0;

        GraphIterator git;
        Collection<Vertex> unexplored = g.getAllVertices();
        Vertex temp;

        int res = 0;
        while(!unexplored.isEmpty()) {
            git = new GraphIterator(g, unexplored.iterator().next());
            res++;
            while(git.hasNext()) {
                temp = git.next();
                unexplored.remove(temp);
            }
        }
        return res;
    }
}

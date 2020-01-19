package Resit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountVertices {
    /**
     * @param g
     *     The graph to search in.
     * @param v
     *     The vertex to start searching from.
     * @param n
     *     The number of edges n that can be traversed from v.
     * @return The number of vertices that are reachable from v (including v), using at most n edges.
     */
    static int countVertices(Graph g, Vertex v, int n) {
        if(n < 0) return 0;
        List<Vertex> visited = new ArrayList<>();
        visited.add(v);
        List<Vertex> level = new LinkedList<Vertex>();
        level.add(v);
        int sum = 1;
        while(n > 0 && !level.isEmpty()) {
            n--;
            List<Vertex> nextlevel = new LinkedList<Vertex>();
            for(Vertex l : level) {

                for(Vertex vert : g.getNeighbours(l)) {
                    if(!visited.contains(vert)) {
                        sum++;
                        visited.add(vert);
                        nextlevel.add(vert);
                    }
                }
            }
            level = nextlevel;
        }
        return sum;
    }

}

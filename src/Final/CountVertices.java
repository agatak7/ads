package Final;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountVertices {
    /**
     * Counts the number of vertices in the same connected component as v in graph g.
     * This is done using depth first search.
     *
     * Returns 0 if the graph or vertex is null
     *
     * @param g
     *     The graph to count vertices in.
     * @param v
     *     The vertex to start counting at.
     * @return the number of vertices in the same connected component.
     */
    public static int countVertices(Graph g, Graph.Vertex v) {
        if(g == null) return 0;
        if(v == null) return 0;
        return countHelper(g, v, new ArrayList<Graph.Vertex>());
    }

    static int countHelper(Graph g, Graph.Vertex v, ArrayList<Graph.Vertex> visited) {
        if(v == null) return 0;
        List<Graph.Vertex> neigh = g.getNeighbours(v);
        if(neigh.isEmpty()) return 1;
        int sum = 0;
        for(Graph.Vertex vert : neigh) {
            if(!visited.contains(vert)) {
                visited.add(vert);
                sum += 1 + countHelper(g, vert, visited);
            }
        }
        return sum;
    }
}

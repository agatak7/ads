package Graphs;

import java.util.*;

public class ShortestPathBFS {
    /**
     * Find the shortest path between v and u in the graph g.
     *
     * @param g
     *     graph to search in.
     * @param v
     *     node to start from.
     * @param u
     *     node to reach.
     * @return the nodes you that form the shortest path, including v and u. An
     * empty list iff there is no path between v and u.
     */
    public static List<Vertex> shortestPath(Graph g, Vertex v, Vertex u) {
        List<Vertex> trav = new LinkedList<Vertex>();
        Map<Vertex, Vertex> predecessors = new TreeMap<>();

        //A BREADTH-FIRST IMPLEMENTATION OF THE ITERATOR!!!
        GraphIterator git = new GraphIterator(g, v);
        Vertex temp;
        while(git.hasNext()) {
            temp = git.next();
            trav.add(temp);
            if(temp == u){
                break;
            }
        }

        if(trav.get(trav.size() - 1) != u) return new ArrayList<>();


        for(int i = 0; i < trav.size(); i++) {
            Vertex pred = trav.get(i);
            for(int j = i; j < trav.size(); j++) {
                Vertex curr = trav.get(j);
                if(!predecessors.containsKey(curr)) {
                    if(g.getNeighbours(pred).contains(curr)) {
                        predecessors.put(curr, pred);
                    }
                }
            }
        }

        List<Vertex> result = new ArrayList<>();
        temp = u;
        result.add(temp);
        while(temp != v) {
            temp = predecessors.get(temp);
            result.add(temp);
        }
        Collections.reverse(result);
        return result;

    }
}

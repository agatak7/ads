package Graphs;

import java.util.*;

/**
 * Implements a Depth first traversal of the Graph, starting at contructor vertex v. It
 * should return nodes at most once. If there is a choice between multiple next nodes,
 * always pick the lowest id node.
 */
class GraphIterator implements Iterator<Vertex> {
    private Graph g;
    private Vertex v;
    private Stack<Vertex> stack;
    private Set<Vertex> colored;
    private int graphSize;

    public GraphIterator(Graph g, Vertex v) {

        stack = new Stack<Vertex>();
        colored = new TreeSet<Vertex>();
        graphSize = g.getAllVertices().size();
        if(v!=null){
            stack.push(v);
            this.v = v;
            colored.add(v);
        }
        if(g!=null) {
            this.g = g;
        }

    }

    @Override
    public boolean hasNext() {
        if(!stack.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public Vertex next() {
        if(hasNext()) {
            Vertex curr = stack.pop();
            v = curr;

            for(int i = g.getNeighbours(curr).size() - 1; i>=0; i--) {
                if(!colored.contains(g.getNeighbours(curr).get(i))) {
                    stack.push(g.getNeighbours(curr).get(i));
                    colored.add(g.getNeighbours(curr).get(i));
                }
            }
            return curr;
        }
        return null;
    }
}

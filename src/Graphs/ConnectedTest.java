package Graphs;

import org.junit.Assert;
import org.junit.Test;

public class ConnectedTest {
    @Test
    public void testSingleLoopingVertex() {
        GraphImpl g = new GraphImpl();
        Vertex v = new VertexImpl(0);
        g.addVertex(v);
        g.addEdge(v, v);
        Assert.assertEquals(1, NumConnected.numberOfConnectedComponents(g));
    }

    @Test
    public void testNotPossibleGraph() {
        GraphImpl g = new GraphImpl();
        Vertex v = new VertexImpl(0);
        Vertex z = new VertexImpl(3);
        g.addVertex(v);
        g.addVertex(z);
        Assert.assertEquals(2, NumConnected.numberOfConnectedComponents(g));
    }
}

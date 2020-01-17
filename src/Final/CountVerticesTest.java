package Final;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountVerticesTest {
    @Test
    public void testNull() {
        Graph g = new Graph();
        Graph.Vertex v = null;
        assertEquals(0, CountVertices.countVertices(g, v));
        g = null;
        v = new Graph.Vertex(1);
        assertEquals(0, CountVertices.countVertices(g, v));
    }

    @Test
    public void testExample() {
        Graph g = new Graph();
        Graph.Vertex v = new Graph.Vertex(1);
        Graph.Vertex w = new Graph.Vertex(2);
        Graph.Vertex x = new Graph.Vertex(3);
        Graph.Vertex y = new Graph.Vertex(4);
        g.addVertex(v);
        g.addVertex(w);
        g.addVertex(x);
        g.addVertex(y);
        g.addEdge(v, w);
        g.addEdge(w, y);
        assertEquals(3, CountVertices.countVertices(g, v));
        assertEquals(3, CountVertices.countVertices(g, w));
        assertEquals(3, CountVertices.countVertices(g, y));
        assertEquals(1, CountVertices.countVertices(g, x));
    }
}

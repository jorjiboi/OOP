import java.util.*;
 

class Graph {
    private int V; // vertikali
 

    //arrays sus susedstvo
    private LinkedList<Integer> adj[];
 
    // Constructor
    @SuppressWarnings("unchecked") Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
 
    // slagagme funkciq za dobavqne na rebrata
    void addEdge(int v, int w)
    {
        adj[v].add(w); 
    }
 
    // funkciq za DFS
    void DFSUtil(int v, boolean poseteni[])
    {
        // markirame vurhut kato stignat;cikul
        poseteni[v] = true;
        System.out.print(v + " ");

        
        //rekursiq za vertikalite
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) 
        {
            int n = i.next();
            if (!poseteni[n])
                DFSUtil(n, poseteni);
        }
    }
 

    // funkciq za rekursiq
    void DFS(int v)
    {
    	// markirane na vertikalite kato NEposeteni
        boolean poseteni[] = new boolean[V];
 
        // traversal rekursivna funkciq za oburshtane na DFS
        DFSUtil(v, poseteni);
    }
 
    public static void main(String args[])
    {
        Graph g = new Graph(5);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 1);
 
        System.out.println("Sortirane:");
 
        g.DFS(2);
    }
}
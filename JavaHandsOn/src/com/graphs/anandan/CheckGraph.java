package com.graphs.anandan;

public class CheckGraph {

	public static void main(String[] args) {
	
		Graph graph=new Graph(6);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addEdge('A', 'B', 1);
		graph.addEdge('A', 'C', 1);
		graph.addEdge('B', 'D', 1);
		graph.addEdge('B', 'E', 1);
		graph.addEdge('C', 'E', 1);
		graph.addEdge('C', 'F', 1);
		graph.addEdge('E', 'D', 1);
		graph.addEdge('E', 'F', 1);
//		graph.printVertex();
		graph.depthFirstSearch();
		graph.dfs();
		graph.breadthFirstSearch();
	}

}

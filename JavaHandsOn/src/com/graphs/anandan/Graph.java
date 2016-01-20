package com.graphs.anandan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	private ArrayList<Vertex> vertices;
	private int vertexCount;
	private int [][] edgeWeightMatrix;

	public Graph(int n){
		vertexCount=n;
		vertices=new ArrayList<Vertex>(vertexCount);
		edgeWeightMatrix = new int[vertexCount][vertexCount];
		for(int i=0;i<vertexCount;i++){
			for(int j=0;j<vertexCount;j++){
				edgeWeightMatrix[i][j]=0;
			}
		}
	}

	public void addVertex(char label){
		Vertex newVertex=new Vertex(label);
		vertices.add(newVertex);
	}

	public void printVertex(){
		int i=0;
		while(i<vertices.size()){
			System.out.println(vertices.get(i).getLabel());
			i++;
		}
	}

	public void addEdge(char source, char destination, int weight){
		int i=getVertexIndex(source);
		int j=getVertexIndex(destination);
		edgeWeightMatrix[i][j]=weight;
	}

	private int getVertexIndex(char lab) {
		int i=0;
		while (vertices.get(i).getLabel()!=lab){
			i++;
		}
		return i;
	}

	public void dfs(){
		System.out.print("[");
		this.dfsRecursion(vertices.get(0).getLabel());
		System.out.println(" ]");
		for(int i=0;i<vertices.size();i++){
			vertices.get(i).setVisited(false);
		}
	}

	public void dfsRecursion(char vertexLable){
		int i=getVertexIndex(vertexLable);
		vertices.get(i).setVisited(true);
		System.out.print(" "+vertexLable);
		int j=0;
		while (j<vertices.size()){
			if((edgeWeightMatrix[i][j]!=0 && !(vertices.get(j).isVisited()))){
				dfsRecursion(vertices.get(j).getLabel());
			}
			j++;
		}
	}

	public void breadthFirstSearch(){
		Queue<Character> label=new LinkedList<Character>();
		label.add(vertices.get(0).getLabel());
		vertices.get(0).setVisited(true);
		System.out.print("[");
		while(!label.isEmpty()){
			int i=getVertexIndex(label.peek());
			System.out.print(" "+label.poll());
			int j=0;
			while(j<vertexCount){
				if(edgeWeightMatrix[i][j]!=0 && !(vertices.get(j).isVisited())){
					label.add(vertices.get(j).getLabel());
					vertices.get(j).setVisited(true);
				}
				j++;
			}			
		}
		System.out.println("]");
		for(int i=0;i<vertices.size();i++){
			vertices.get(i).setVisited(false);
		}
	}

//	public void bfs(){
//		System.out.print("[");
//		this.bfsRecursion(vertices.get(0).getLabel());
//		System.out.println(" ]");
//		for(int i=0;i<vertices.size();i++){
//			vertices.get(i).setVisited(false);
//		}
//	}
//	
//	public void bfsRecursion(char label){
//		System.out.println(label);
//		int i=getVertexIndex(label);
//		vertices.get(i).setVisited(true);
//		int j=0;
//		while(j<vertexCount){
//			if(edgeWeightMatrix[i][j]!=0 && !(vertices.get(i).isVisited())){
//				syso
//			}
//		}
//	}
	
	public void depthFirstSearch(){
		Stack<Character> vertexLabel=new Stack<Character>();
		vertexLabel.push(vertices.get(0).getLabel());
		vertices.get(0).setVisited(true);
		System.out.print("[" +vertices.get(0).getLabel());
		while (!vertexLabel.isEmpty()){
			int i=getVertexIndex(vertexLabel.peek());
			int adjacent=getAdjacent(i);
			if(adjacent==-1){
				vertexLabel.pop();
			}
			else{
				System.out.print(" "+vertices.get(adjacent).getLabel());
				vertices.get(adjacent).setVisited(true);
				vertexLabel.push(vertices.get(adjacent).getLabel());
			}
		}
		System.out.println("]");
		for(int i=0;i<vertices.size();i++){
			vertices.get(i).setVisited(false);
		}
	}

	public int getAdjacent(int i) {
		int j=0;
		while(j<vertices.size()){
			if((edgeWeightMatrix[i][j]!=0) && (!(vertices.get(j).isVisited()))){
				return j;
			}
			j++;
		}
		return -1;
	}
}

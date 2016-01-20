package com.graphs.anandan;

public class Vertex {
	
	private char label;
	private boolean visited;
	public Vertex(char lab){
		setLabel(lab);
		setVisited(false);
	}
	public char getLabel() {
		return label;
	}
	public void setLabel(char label) {
		this.label = label;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}

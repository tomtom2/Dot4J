package com.github.tomtom2.dot4j.api;

import java.util.HashSet;
import java.util.Set;

public class Graph {

	private String name;
	private Set<Graph> subgraphs = new HashSet<Graph>();

	public void addNode(Graph graph, Node node) {
		if (!subgraphs.contains(graph))
			subgraphs.add(graph);
	}
	
	public void addNode(Node node) {
		addNode(this, node);
	}
}

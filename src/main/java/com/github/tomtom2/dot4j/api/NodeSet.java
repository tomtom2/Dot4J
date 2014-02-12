package com.github.tomtom2.dot4j.api;

import java.util.HashSet;
import java.util.Set;

public class NodeSet {

	private static Set<Node> nodes = new HashSet<Node>();
	
	public Node getNodeByName(String name){
		for(Node node : nodes){
			if(node.getName().equals(name))
				return node;
		}
		return null;
	}
	
	public boolean hasNode(String nodeName){
		try {
			return nodes.contains(new Node.Builder(nodeName).build());
		} catch (Exception e) {
			return false;
		}
	}
}

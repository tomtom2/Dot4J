package com.github.tomtom2.dot4j.api;

import java.util.HashSet;
import java.util.Set;

public class Node {

	private String name;
	private String shape;
	private String label;
	
	private Set<Link> neighbours = new HashSet<Link>();
	
	
	private Node(String name, String shape, String label){
		this.name = name;
		this.shape = shape;
		this.label = label;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Node))
			return false;
		return ((Node)o).name.equals(name);
	}
	public int hashCode(){
		return name.hashCode();
	}
	
	public static class Builder{
		
		private String name;
		private String shape = "";
		private String label = "";
		
		public Builder(String nodeName){
			this.name = nodeName;
		}
		
		public Node.Builder shape(String shape){
			this.shape = shape;
			return this;
		}
		
		public Node.Builder label(String label){
			this.label = label;
			return this;
		}
		
		public Node build() throws Exception{
			if(name == null)
				throw new Exception("Forbidden node state");
			if(name.equals(""))
				throw new Exception("Forbidden node state");
			return new Node(name, shape, label);
		}
	}

	public String getName() {
		return name;
	}

	public String getShape() {
		return shape;
	}

	public String getLabel() {
		return label;
	}

	public Set<Link> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(Set<Link> neighbours) {
		this.neighbours = neighbours;
	}
	
	
	
}

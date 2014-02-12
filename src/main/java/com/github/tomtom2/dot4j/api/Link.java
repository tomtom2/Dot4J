package com.github.tomtom2.dot4j.api;

public class Link {

	private Node node;
	private String shape;
	private String label;
	
	private Link(Node node, String shape, String label){
		this.node = node;
		this.shape = shape;
		this.label = label;
	}
	
	public static class Builder{
		private Node node;
		private String shape;
		private String label;
		
		public Builder(Node node){
			this.node = node;
		}
		
		public Link build() throws Exception{
			if(node == null)
				throw new Exception("Improper link exception");
			return new Link(node, shape, label);				
		}
		
		public Link.Builder shape(String shape){
			this.shape = shape;
			return this;
		}
		
		public Link.Builder label(String label){
			this.label = label;
			return this;
		}
		
	}

	public Node getNode() {
		return node;
	}

	public String getShape() {
		return shape;
	}

	public String getLabel() {
		return label;
	}
	
}

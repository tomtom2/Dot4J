package com.github.tomtom2.dot4j.api.writer;

import com.github.tomtom2.dot4j.api.Link;
import com.github.tomtom2.dot4j.api.Node;

class NodeWriter {

	public String getNodeAsString(Node node){
		String str = node.getName();
		str += getNodeOptions(node);
		return str;
	}
	
	public String getNodeEdgesAsString(Node node){
		String str = "";
		for(Link link : node.getNeighbours()){
			str += node.getName() + " -> " + link.getNode().getName() + "\n";
		}
		return str;
	}

	private String getNodeOptions(Node node) {
		if(node.getLabel().equals("") && node.getShape().equals(""))
			return "";
		String str = "[";
		if(!node.getShape().equals("")){
			str += "shape="+node.getShape()+", ";
		}
		if(!node.getLabel().equals("")){
			str += "label="+node.getLabel()+", ";
		}
		str = str.substring(0, str.length()-2);
		return str;
	}
}

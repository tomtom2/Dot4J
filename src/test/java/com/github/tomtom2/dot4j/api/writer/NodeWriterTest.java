package com.github.tomtom2.dot4j.api.writer;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.github.tomtom2.dot4j.api.Link;
import com.github.tomtom2.dot4j.api.Node;

public class NodeWriterTest {

	@Test
	public void getNodeEdgesAsString() throws Exception{
		//prepare
		Node node = new Node.Builder("node").build();
		Node node2 = new Node.Builder("node2").build();
		Link lnk = new Link.Builder(node2).build();
		node.getNeighbours().add(lnk);
		
		//act
		String str = "";
		
		//assert
		fail();
	}
}

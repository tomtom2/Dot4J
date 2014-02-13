package com.github.tomtom2.dot4j.api;

import org.junit.Test;

public class LinkTest {

	@Test
	public void build() throws Exception {
		// prepare
		Node node = new Node.Builder("myNode").build();
		new Link.Builder(node).build();
	}
	
	@Test(expected=Exception.class)
	public void buildException() throws Exception {
		// prepare
		Node node = new Node.Builder("").build();
		new Link.Builder(node).build();
	}

}
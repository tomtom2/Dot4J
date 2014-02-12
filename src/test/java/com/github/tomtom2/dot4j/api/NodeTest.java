package com.github.tomtom2.dot4j.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.tomtom2.dot4j.api.Node;

public class NodeTest {

	@Test
	public void equelsBetweenSameObject() throws Exception{
		//prepare
		Node node = new Node.Builder("myNode").build();
		
		//assert
		assertTrue(node.equals(node));
	}
	
	@Test
	public void equelsBetweenTowObjects() throws Exception{
		//prepare
		Node node = new Node.Builder("myNode").build();
		Node node1 = new Node.Builder("myNode").shape("circle").build();
		
		//assert
		assertTrue(node.equals(node1));
	}
	
	@Test
	public void equelsBetweenTowUnequalObjects() throws Exception{
		//prepare
		Node node = new Node.Builder("myNode").build();
		Node node1 = new Node.Builder("1").shape("circle").build();
		
		//assert
		assertFalse(node.equals(node1));
	}
	
	@Test
	public void equelsBetweenTowClasses() throws Exception{
		//prepare
		Node node = new Node.Builder("myNode").build();
		Object node1 = new Object();
		
		//assert
		assertFalse(node.equals(node1));
	}
	
	@Test(expected=Exception.class)
	public void buildNodeWithNullName() throws Exception{
		//act
		new Node.Builder("").build();
	}
	
	@Test(expected=Exception.class)
	public void buildNodeWithEmptyName() throws Exception{
		//act
		new Node.Builder("").build();
	}
}

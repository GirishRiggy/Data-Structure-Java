package com.vacker.example.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	//VARIABLES
	private Integer data;
	private Node parent;
	private List<Node> children = new ArrayList<>();
	
	//IMPORTANT
	public Node(Node parent) {
		this.parent = parent;
	}

	
	// GETTERS & SETTERS
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}

	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}

	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
}

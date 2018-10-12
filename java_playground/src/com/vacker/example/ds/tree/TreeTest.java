package com.vacker.example.ds.tree;

public class TreeTest {
	
	public static void main(String[] args) {
		
		Node rootNode = new Node(null);
		rootNode.setData(50);
		
		
		//child node of root
		Node childNode = new Node(rootNode);
		//add child to the childnode
		addChild(childNode, 20);
		addChild(childNode, 30);
		
		
		//add child to root node
		Node child2 = addChild(childNode,10);
		//add child to the child node created above
		addChild(child2, 5);
		
		
		rootNode.getChildren().add(childNode);
		
		printTree(rootNode, " ");
		
	}
	
	private static Node addChild(Node parent, Integer data) {
	   Node node = new Node(parent);
	   node.setData(data);
	   parent.getChildren().add(node);
	   return node;
	}
	private static void printTree(Node node, String appender) {
	   System.out.println(appender + node.getData());
	   for (Node each : node.getChildren()) {
	       printTree(each, appender + appender);
	   }
	}

}

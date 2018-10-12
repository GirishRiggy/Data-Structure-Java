package com.vacker.example.ds.tree;

public class BSTTest {
	
	public static BSTNode root;
	
	public static void main(String[] args) {
		
		insert(3);insert(8);insert(1);
		System.out.println("Original Tree : ");
		display(root);		
		System.out.println("");
		
		System.out.println("DATA EXIST :::::: "+find(0));
		
	}

	public static void insert(Integer data){
		
		BSTNode newNode = new BSTNode(data);
		if( root == null ) {
			root = newNode;
			return;
		}
		BSTNode current = root;
		while (true) {
			if( data < current.data ) {				
				current = current.left;
				if ( current == null ) {
					root.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if ( current == null ) {
					root.right = newNode;
					return;
				}
			}
		}
	}
	
	public static void display (BSTNode root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	public static boolean find (Integer data) {
		BSTNode current = root;
		
		while (current != null) {
			if(current.data.equals(data))
				return true;
			if(current.data < data ) {
				current = current.right;
			} else {
				current = current.left;
			}
		}
		return false;
	}
	
}

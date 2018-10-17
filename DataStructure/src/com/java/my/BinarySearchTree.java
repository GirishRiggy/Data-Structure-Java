package com.java.my;
import com.java.my.Node;

public class BinarySearchTree 
{
	Node root;
	public void insert(int key){
		root = insertNode(root, key );
	}
	
	public Node insertNode(Node root, int key){
		
		// Node newNode = new  Node(key);
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key< root.key){
			root.leftchild = insertNode(root.leftchild, key);
		} else if(key>root.key){
			root.rightchild = insertNode(root.rightchild, key);
		}
		
		return root;
	}
	
	public void inorderTraversals(Node root){
		if(root != null){
			inorderTraversals(root.leftchild);
			System.out.println(root.key);
			inorderTraversals(root.rightchild);
		}
	}
	
	public void preorderTraversals(Node root){
		if(root != null){
			System.out.println(root.key);
			inorderTraversals(root.leftchild);
			inorderTraversals(root.rightchild);
		}
	}
	
	public void postorderTraversals(Node root){
		if(root != null){
			inorderTraversals(root.leftchild);
			inorderTraversals(root.rightchild);
			System.out.println(root.key);
		}
	}
	
	public void search(Node root, int key){
		Node temp = findNode(root,key);
			
		if(temp == null){
			System.out.println("Element not found");
		} else {
			System.out.println(temp.key);
		}
	}
	
	public Node findNode(Node root, int key){
		Node temp=root;
		if(temp == null || temp.key == key){
			return temp;
		}
		if(key < temp.key){
			return findNode(temp.leftchild,key);
		} 
		
		return findNode(temp.rightchild,key);
		
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(600);
		tree.insert(500);
		tree.insert(15);
		tree.insert(75);
		tree.insert(60);
		tree.insert(88);
		
		
		System.out.println("In-order traversals");
		tree.inorderTraversals(tree.root);
		System.out.println("Pre order traversals");
		tree.preorderTraversals(tree.root);
		System.out.println("Post order traversals");
		tree.postorderTraversals(tree.root);
		
		System.out.println("Find element");
		tree.search(tree.root, 8009);
	}
}

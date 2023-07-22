package com.learning.DSA;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node left,right;
	public Node(int data) {
		this.data = data;
		left=right=null;
	}
	
}

public class BSTDemo {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         BSTDemo bst =new BSTDemo();
         bst.root=bst.insert(bst.root,40);
         bst.root=bst.insert(bst.root,20);
         bst.root=bst.insert(bst.root,60);
         bst.root=bst.insert(bst.root,10);
         bst.root=bst.insert(bst.root,30);
         bst.root=bst.insert(bst.root,50);
         bst.root=bst.insert(bst.root,70);
         //bst.inOrderTraversal(bst.root);
         int targetSum=130;
         bst.findPairWithGivenSum(bst.root,targetSum);
	}
	
	private void findPairWithGivenSum(Node root, int targetSum) {
		// TODO Auto-generated method stub
		Set<Integer> set= new HashSet<>();
		if (!findPairUtil(root,targetSum,set)) {
			System.out.println("Pair not found");
		}
	}

	private boolean findPairUtil(Node root, int targetSum, Set<Integer> set) {
		// TODO Auto-generated method stub
		if(root==null)
		return false;
		if(findPairUtil(root.left,targetSum,set))
			return true;
		
		int diff = targetSum -root.data;
					
		if(set.contains(diff)) {
			System.out.println("Pair is found [" + diff + ", " + root.data +"]");
			return true;
		} else 
			set.add(root.data);
			
	  return findPairUtil(root.right,targetSum, set);		
	}

	private void inOrderTraversal(Node root) {
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	private Node insert(Node node, int data) {
		// TODO Auto-generated method stub
		if(node==null) {
			node=new Node(data);
		    return node;
		} 
		if(data < node.data) {
			node.left=insert(node.left,data);
		} else if(data > node.data) {
			node.right=insert(node.right,data);
		}
		
		return node;
	}

	

}

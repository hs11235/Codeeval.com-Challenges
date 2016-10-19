import java.util.*;
import java.io.*;


public class BinaryTree {
	
	Node root = null;
	
	public void addNode(int key) {
		
		Node newNode = new Node(key);
		
		if (root == null) {
			root = newNode;
			root.parent = null;
		} else {
			
			//
			Node focusNode = root;
			
			Node parent;
			
			while (true) {
				
				parent = focusNode;
				
				if (key < focusNode.key) {
					
					focusNode = focusNode.leftChild;
					
					if (focusNode == null) {
						
						parent.leftChild = newNode;
						parent.leftChild.parent = parent;
						return;
					}
				} else {
					
					focusNode = focusNode.rightChild;
					
					if (focusNode == null) {
						
						parent.rightChild = newNode;
						parent.rightChild.parent = parent;
						return;
					}
				}
			}
			//
		}
	}
	
	public Node findNode(int key) {
		
		Node focusNode = root;
		
		while (focusNode.key != key) {
			
			if (key < focusNode.key) {
				
				focusNode = focusNode.leftChild;
			} else {
				
				focusNode = focusNode.rightChild;
			}
			
			if (focusNode == null)
				return null;
		}
		
		return focusNode;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(30);
		theTree.addNode(52);
		theTree.addNode(8);
		theTree.addNode(3);
		theTree.addNode(20);
		theTree.addNode(10);
		theTree.addNode(29);
		
		File outFile = new File ("input.txt");
		FileWriter fWriter = new FileWriter (outFile);
		PrintWriter pWriter = new PrintWriter (fWriter);
		pWriter.println("8 52");
		pWriter.println("3 29");
		//pWriter.println("25");
		//pWriter.println("3");
		//pWriter.println("1215306625");
		pWriter.close();
		
		// input stuff
		File inFile = new File("input.txt");
		Scanner sc = new Scanner(inFile);
		//
		while (sc.hasNextInt()) {
			
		int a = sc.nextInt();	
		int b = sc.nextInt();
			
		Node firstNode = theTree.findNode(a);
		Node secondNode = theTree.findNode(b);
		
		Node dummy;
		
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		
		dummy = firstNode;
		firstList.add(dummy.key);
		
		while (dummy != theTree.root) {
			
			dummy = dummy.parent;
			firstList.add(dummy.key);
		}
		
		dummy = secondNode;
		secondList.add(dummy.key);
		
		while (dummy != theTree.root) {
			
			dummy = dummy.parent;
			secondList.add(dummy.key);
		}
		
		// find lowest ancestor
		System.out.println(LCA(firstList, secondList));
		}
		sc.close();
	}
	
	static int LCA(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		
		for (int i=0; i<arr1.size(); i++) {
			
			for (int j=0; j<arr2.size(); j++) {
				
				if (arr1.get(i) == arr2.get(j))
					return arr1.get(i);
			}
		}
		return 30;
	}
}


class Node {
	
	int key;
	
	Node parent;
	Node leftChild;
	Node rightChild;
	
	Node (int key) {
		
		this.key = key;
	}
}





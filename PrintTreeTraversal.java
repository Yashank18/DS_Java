class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
public class Main
{
    static void printPreOrder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    static void printPostOrder(Node root)
    {
        if(root==null) return;
        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.data+" ");
    }
    static void printInOrder(Node root)
    {
        if(root==null) return;
        printPreOrder(root.left);
        System.out.print(root.data+" ");
        printPreOrder(root.right);
    }
	public static void main(String[] args) {
		 Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        printPreOrder(root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        printInOrder(root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        printPostOrder(root);
	}
}

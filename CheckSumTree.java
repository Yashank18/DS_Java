class Node  
{ 
    int data; 
    Node left, right, nextRight; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = nextRight = null; 
    } 
} 
class BTree
{
    Node root;
    int sum(Node head)
    {
        if(head==null)
            return 0;
        return sum(head.left)+head.data+sum(head.right);
    }
    
    int isSumTree(Node node)
    {
        int ls, rs; 
   
        if ((node == null) || (node.left == null && node.right == null)) 
            return 1; 
   
        
        ls = sum(node.left); 
        rs = sum(node.right); 
   
        if ((node.data == ls + rs) && (isSumTree(node.left) != 0) 
                && (isSumTree(node.right)) != 0) 
            return 1; 
   
        return 0;
    }
}
public class Main
{
	public static void main(String[] args) {
		BTree tree = new BTree(); 
        tree.root = new Node(26); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(6); 
        tree.root.right.right = new Node(3); 
   
        if (tree.isSumTree(tree.root) != 0) 
            System.out.println("The given tree is a sum tree"); 
        else
            System.out.println("The given tree is not a sum tree"); 
    } 
	}


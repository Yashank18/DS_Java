class BinarySearchTree
{
    class Node
    {
        Node left;
        Node right;
        int data;
        public Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    void inorder()
    {
        printIno(root);
    }
    void printIno(Node root) { 
        if (root != null) { 
            printIno(root.left); 
            System.out.println(root.data); 
            printIno(root.right); 
        } 
    } 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
    
    Node insertRec(Node root, int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        
        if(key<root.data)
        {
            root.left=insertRec(root.left,key);
        }
        else if(key>root.data)
        {
            root.right=insertRec(root.right,key);
        }
        
        return root;
    }
     Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
}
public class Main
{
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        tree.inorder(); 
	}
}

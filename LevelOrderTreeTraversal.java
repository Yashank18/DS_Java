class BinaryTree
{
    Node root=null;
    void printLevelOrder()
    {
     int h = Height(root);
     int i;
     for(i=1;i<=h;i++)
     {
         printGivenLevel(root,i);
     }
    }
    
    int Height(Node root)
    {
        if(root==null)
        return 0;
        else
        {
            int lheight = Height(root.left);
            int rheight = Height(root.right);
            
            if(lheight>rheight)
            {
                return lheight+1;
            }
            else
            return rheight+1;
        }
    }
    
    void printGivenLevel(Node root, int i)
    {
        if(i==0)
        return ;
        if(i==1)
        {
            System.out.print(root.data+" ");
        }
        else if(i>1)
        {
            printGivenLevel(root.left,i-1);
            printGivenLevel(root.right,i-1);
        }
    }
    
    
}
class Node
{
    Node left;
    Node right;
    int data;
    public Node(int item)
    {
        data = item;
        left=right=null;
    }
}

public class Main
{
	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree(); 
       tree.root= new Node(1); 
       tree.root.left= new Node(2); 
       tree.root.right= new Node(3); 
       tree.root.left.left= new Node(4); 
       tree.root.left.right= new Node(5); 
         
       System.out.println("Level order traversal of binary tree is "); 
       tree.printLevelOrder(); 
	}
}

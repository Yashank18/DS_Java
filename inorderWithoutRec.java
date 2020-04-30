import java.util.Stack; 
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
    static void inOrder(Node root)
    {
        if(root==null) return;
        
        Stack<Node> s= new Stack<Node>();
        Node current=root;
        
        while(current!=null || s.size()>0)
        {
            while(current!=null)
            {
                s.push(current);
                current=current.left;
            }
            
            current=s.pop();
            System.out.print(current.data+" ");
            
            current=current.right;
        }
        
    }
	public static void main(String[] args) {
		 Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        inOrder(root);
	}
}

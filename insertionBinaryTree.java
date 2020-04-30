import java.util.*;
public class Main
{
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int item){
            data=item;
            left=right=null;
        }
    }
    static Node root;
    static Node temp=null;
    
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); 
        System.out.print(temp.data+" "); 
        inorder(temp.right); 
    }
    
    static void insert(Node data,int key)
    {
        Queue<Node> q= new LinkedList<Node>();
        q.add(data);
        
        while(!q.isEmpty())
        {
            data = q.peek();
            q.remove();
            if(data.left==null)
            {
                data.left=new Node(key);
                break;
            }
            else
            q.add(data.left);
            if(data.right==null)
            {
                data.right=new Node(key);
                break;
            }
            else
            q.add(data.right);
        }
    }
    
	public static void main(String[] args) {
		root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root); 
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); 
	}
}

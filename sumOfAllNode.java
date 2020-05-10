class Tree
{ 
static class Node  
{  
    int key;  
    Node left, right;  
} 
static Node newNode(int key)  
{  
    Node node = new Node();  
    node.key = key;  
    node.left = node.right = null;  
    return (node);  
}  

static int addBT(Node root)  
{  
    if (root == null)  
        return 0;  
    return (root.key + addBT(root.left) +  
                       addBT(root.right));  
}  
  
public static void main(String args[]) 
{  
    Node root = newNode(2);  
    root.left = newNode(4);  
    root.right = newNode(6);  
    root.left.left = newNode(8);  
    root.left.right = newNode(12);  
    root.right.left = newNode(20);  
    root.right.right = newNode(22);  
    root.right.left.right = newNode(29);  
  
    int sum = addBT(root);  
    System.out.println("Sum of all the elements is: " + sum);  
}  
} 

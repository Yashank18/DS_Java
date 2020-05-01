import java.util.Stack; 
class Node { 
  
    char value; 
    Node left, right; 
  
    Node(char item) { 
        value = item; 
        left = right = null; 
    } 
} 
class ExpressionTree
{
    boolean isOperand(char s)
    {
        if(s=='+' || s=='/' || s=='-' || s=='*' || s=='^')
        return true;
        return false;
    }
    void inorder(Node t) { 
        if (t != null) { 
            inorder(t.left); 
            System.out.print(t.value + " "); 
            inorder(t.right); 
        } 
    } 
   Node constructTree(char post[])
    {
        Stack<Node> t= new Stack();
        Node n,n1,n2;
        
        for(int i=0;i<post.length;i++)
        {
            if(!isOperand(post[i]))
            {
                n = new Node(post[i]);
                t.push(n);
            }
            else
            {
                n= new Node(post[i]);
                n1=t.pop();
                n2=t.pop();
                n.right=n1;
                n.left=n2;
                
                t.push(n);
            }
        }
        n = t.peek(); 
        t.pop(); 
  
        return n;
    }
}
class Main {
 
  public static void main(String[] args)
  {
    ExpressionTree et = new ExpressionTree(); 
        String postfix = "ab+ef*g*-"; 
        char[] charArray = postfix.toCharArray(); 
        Node root = et.constructTree(charArray); 
        System.out.println("infix expression is"); 
        et.inorder(root); 
  }
}

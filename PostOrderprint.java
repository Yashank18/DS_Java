// Print postorder from inorder and preorder given

class ppTree{
     static int preIndex = 0; 
    static void printPost(int[] in, int[] pre, int intStr, int intEnd)
    {
        if(intStr>intEnd) return;
        
        int index=search(in,intStr,intEnd,pre[preIndex++]);
        
        printPost(in,pre,intStr,index-1);
        printPost(in,pre,index+1,intEnd);
        
        System.out.print(in[index]+" ");
    }
    static int search(int[] in,int str, int end, int data)
    {int i=0;
        for(i=str;i<end;i++)
        {
            if(in[i]==data)
            return i;
            
        }
        return i;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		int in[] = { 4, 2, 5, 1, 3, 6 }; 
        int pre[] = { 1, 2, 4, 5, 3, 6 }; 
        int len = in.length; 
        ppTree tree = new ppTree(); 
        tree.printPost(in, pre, 0, len - 1); 
	}
}

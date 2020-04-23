import java.util.*;

public class Main
{
    static void Merge(int array[], int l, int m, int r)
    {
         int n1 = m - l + 1; 
        int n2 = r - m; 
  
        
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j];
            
            int i=0,j=0,k=l;
            while(i<n1 && j<n2)
            {
                if(L[i]<=R[j])
                {
                    array[k]=L[i];
                    i++;
                }
                else
                {
                    array[k]=R[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                array[k]=L[i];
                i++;k++;
            }
            while(j<n2){
                array[k]=R[j];
                j++;k++;
            }
            
            
    }
    static void printArray(int array[]) 
    { 
        int n = array.length; 
        System.out.println("There you go my friend");
        for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
    
    static void sort(int[] array,int l,int r)
    {
        if(l<r)
        {
        int mid=(l+r)/2;
        sort(array,l,mid);
        sort(array,mid+1,r);
        
        Merge(array,l,mid,r);
        }
        
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Hey there. Done with random numbers. Want to sort? Shoot at me");
	    System.out.println("Enter Number of Items");
	    int n=sc.nextInt();
	    int array[]= new int[n];
		System.out.println("Enter Elements to Sort");
		for(int a=0;a<n;a++)
		{
		    array[a]=sc.nextInt();
		}
		System.out.println("Press Y to Sort or R to change numbers");
		char i=sc.next().charAt(0);
		if(i=='R')
		{
    		System.out.println("Enter new Elements to Sort");
    		for(int a=0;a<n;a++)
        		{
        		    array[a]=sc.nextInt();
        		}
		}
		else
		{
	        sort(array,0,n-1);
	        printArray(array);
		}
	}
}

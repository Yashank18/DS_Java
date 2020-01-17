package dsjava;
import java.util.Scanner;

public class array {
	public static int n;
	static int array[]=new int[100]; 
	
	
	static int linear(int ele)
    {
        
        int a=ele;
        int fin=0;
        
        for(int j=0;j<array.length;j++)
        {
            if(array[j]==a)
            {
                return j;
            }
            else 
            {
                fin=-1;
            }
        }
        return fin;
    }
    
    
  static  int add(int position, int number,int size) {
    	
    	
    	int pos=position;
    	int num=number;
    	int sizes=size;
    	sizes++;
    	for(int i=sizes;i>pos;i--)
    	{
    		array[i]=array[i-1];
    		
    		
    	}
    	array[pos]=num;
    	for(int j=0;j<sizes;j++)
    	{
    		System.out.println(array[j]+" ");
    	}
    	return sizes;
    }
    
    
   static int removeat(int remove,int n) {
    	
    	int removeat=remove;
    	int sizze=n;
    	for(int q=removeat;q<sizze;q++) {
    		
    		array[q]=array[q+1];
    		
    	}
    	sizze--;
    	for(int p=0;p<sizze;p++)
    	{
    		System.out.println(array[p]+" ");
    		
    	}
    	
    	return sizze;
    }
   static int removeit(int remove,int n) {
    	int sizzess=n;
    	
    	int toremove=remove;
    	
    	for(int i=0;i<sizzess;i++)
    	{
    		if(array[i]==toremove)
    		{
    			for(int j=i;j<sizzess;j++)
    			{
    				array[j]=array[j+1];
    			}
    		}
    		
    	}
    	sizzess--;
    	for(int p=0;p<sizzess;p++)
    	{
    		System.out.println(array[p]+" ");
    		
    	}
    	
    	return sizzess;
    }
    
   static int autoadd(int element,int size) {
    	int sized=size;
    	
    	int ele=element;
    	sized++;
    	for(int i=0;i<sized-1;i++)
    	{
    		if(array[i]>ele)
    		{
    			for(int j=sized-1;j>i;j--) {
    				array[j]=array[j-1];
    			}
    			array[i]=ele;
    			break;
    		}
    		
    	}
    	
    	for(int i=0;i<sized-1;i++)
    	{
    		System.out.println(array[i]+" ");
    	}
    	
    	return sized;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of elements");
        
        n=scanner.nextInt();
        
        System.out.println("Enter "+ n +" Elements");
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        
        System.out.println("1 for add, 2 for remove from index, 3 for remove by search, 4 for Searching");
        int select;
        select=scanner.nextInt();
        
        
        
        
        switch(select) {
        case 1:{
        System.out.println("Enter number to add");
        int number;
        
        number=scanner.nextInt();
        System.out.println("Enter posi where to add");
        int posi;
        posi=scanner.nextInt();
        int a=add(posi,number,n);
        n=a;
        };
        
        case 2:{
        	System.out.println("Enter index to remove the number from it");
        	int remove_index;
        	remove_index=scanner.nextInt();
        	int r=removeat(remove_index,n);
        	n=r;
        };
        case 3:{
        	System.out.println("Enter number to remove");
        	int removal;
        	removal=scanner.nextInt();
        	int y=removeit(removal,n);
        };
        
        case 4:{
        int element;
        System.out.println("Enter element to search");
        element=scanner.nextInt();
        
       int s= linear(element);
       
       if(s==-1)
       {
           System.out.println("Element isnt available");
       }
       else{
       System.out.println("Element present at " +s+" position");
       	   }
        };
        case 5:{
        	System.out.println("Enter element to add");
        	int to_add;
        	to_add=scanner.nextInt();
        	int u=autoadd(to_add,n);
        }
        };

	}

}

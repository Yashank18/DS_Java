package dsjava;



public class orderedlinkedlist {

	Node head;
	public static class Node{
		int data;
		Node next;
		
		// to get data a constructor
		Node(int d){
		data=d;
		next=null;
		}
		
		
	}
	
	public static orderedlinkedlist insert(orderedlinkedlist list,int data) {
		
		Node current = list.head;
		Node newnode = new Node(data);
		Node prev=list.head;int f=0;
		newnode.next=null;
		
		// to check if list is empty
		if(list.head==null) {
			list.head=newnode;
		}
		else {
			// to check when list is not empty
			while(current!=null) 
			{
			// when data to be added at start	
				if(current.data>newnode.data && current==list.head) {
					newnode.next=current;
					list.head=newnode;
					break;
				}
				// when data to be added in between
				else if(current.data>newnode.data) {
					newnode.next=current;
					prev.next=newnode;
					break;
					
				}
				// data to be added at last
				else if(current.next==null)
				{
					current.next=newnode;
					break;
				}
				current=current.next;
				// flag to use previous
				if(f==1)
					prev=prev.next;
				// flag wont start at first
				f=1;
			}
		}
		
		
		
		return list;
	}
	
	public static void printlist(orderedlinkedlist list) {
		Node current = list.head;
		while(current != null)
		{
			System.out.println(current.data +" ");
			current = current.next;																									
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			orderedlinkedlist list = new orderedlinkedlist();
			
			list = insert(list,5);
			list = insert(list,7);
			list = insert(list,6);
			list = insert(list,2);
			list = insert(list,1);
			list = insert(list,8);
			printlist(list);
	}

}

package dsjava;

public class LinkedList {
	// created initial node names as head
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
	
	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next=null;
		// null because we create a node without giving it next one
		
		//check if list is empty
		if(list.head == null)
		{
			list.head=newNode;
		}
		// if list isn't empty find last element and add
		else
		{
			Node last = list.head;
			// take this last to get to last element but starting from head only
			while(last.next!=null)
			{
				last=last.next;
			}
			// we came to last element now, go to 
			last.next=newNode;
		}
		return list;
	}
	public static LinkedList insertstart(LinkedList list,int data) {
		// to insert at start 
		Node startNode = new Node(data);
		startNode.next=null;
		if(list.head == null)
		{// to check if list is empty
			list.head=startNode;
		}
		else
		{// to start 
			startNode.next=list.head;
			list.head=startNode;
		}
		
		return list;
	}
	public static LinkedList insertat(LinkedList list, int data, int position)
	{// to insert at given position
		Node startNode = new Node(data);
		startNode.next=null;
		
		Node check=list.head;
		for(int i=0;i<position-1;i++)
		{
			
			check = check.next;
		}
		startNode.next=check.next;
		check.next=startNode;
		
		
		
		return list;
	}
	public static LinkedList removeend(LinkedList list) {
		
		Node current=list.head;
		while(current.next.next != null)
		{
			current=current.next;
		}
		current.next=null;
		
		return list;
	}
	
	public static LinkedList removeStart(LinkedList list)
	{
		Node current=list.head;
		list.head=current.next;
		return list;
	}
	
	public static LinkedList removeAt(LinkedList list, int position)
	{
		
		
		Node check=list.head;
		for(int i=0;i<position-1;i++)
		{
			
			check = check.next;
		}
		check=check.next.next.next;
		check.next.next=null;
		
		return list;
	}
	
	// Incomplete
	
	public static LinkedList BubbleSort(LinkedList list)
	{
		Node current=list.head;
		Node toGo=list.head;
		Node prev=list.head;
		while(toGo.next.next!=null) 
		{
			while(current.next !=null)
			{
				if(current.data>current.next.data)
				{
					
					// temp node to store;
					Node temp=current.next;
					current.next=temp.next;
					temp.next=current;
					list.head=temp;
					
					
				}
				else if(current!=list.head && current.data>current.next.data)
				{
					Node tmp=current.next;
					current.next=tmp.next;
					tmp.next=current;
					prev.next=tmp;
					prev=prev.next;
				}
			}
			toGo=toGo.next;
		}
		
		
		return list;
	}
	
	public static void printlist(LinkedList list)
	{
		Node current = list.head;
		while(current != null)
		{
			System.out.println(current.data +" ");
			current = current.next;																									
		}
		
	}
	

	public static void main(String[] args) {
		
		
		
		LinkedList list = new LinkedList(); 
		
        
  
        // Insert the values 
	
        list = insertstart(list, 1); 
        list = insertstart(list, 2); 
        list = insertstart(list, 3); 
        list = insertstart(list, 4); 
        list = insertstart(list, 5); 
        list = insertstart(list, 6); 
        list = insertstart(list, 7); 
        list = insertstart(list, 8); 
        list = removeend(list);
        list = removeStart(list);
        list =insertat(list,9,3);
        list = removeAt(list,3);
        list = BubbleSort(list);
        printlist(list); 

	}

}

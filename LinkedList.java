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
		
		Node startNode = new Node(data);
		startNode.next=null;
		if(list.head == null)
		{
			list.head=startNode;
		}
		else
		{
			startNode.next=list.head;
			list.head=startNode;
		}
		
		return list;
	}
	public static LinkedList insertat(LinkedList list, int data, int position)
	{
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
        
        list =insertat(list,9,3);
        printlist(list); 

	}

}

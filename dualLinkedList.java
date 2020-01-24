package dsjava;

import dsjava.LinkedList.Node;

public class dualLinkedList {
	
	Node head;
	public static class Node{
			int data;
			Node next;
			Node prev;
			
			// to get data a constructor
			Node(int d){
			data=d;
			next=null;
			prev=null;
		}
		
		
	}
	
	public static dualLinkedList insertStart(dualLinkedList list, int data) {
		
		Node newnode=new Node(data);
		
		
		if(list.head==null) {
			list.head=newnode;
		}
		
		else
		{
			newnode.next=list.head;
			list.head.prev=newnode;
			list.head=newnode;
		}
		
		return list;
	}
	
	
	public static dualLinkedList insertLast(dualLinkedList list, int data)
	{
		
		Node newnode=new Node(data);
		Node current=list.head;
		
		if(list.head==null) {
			list.head=newnode;
		}
		else
		{
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newnode;
			newnode.prev=current;
		}
		
		return list;
	}
	
	
	public static dualLinkedList insertAt(dualLinkedList list,int data, int pos)
	{
		
		Node current=list.head;
		Node newnode=new Node(data);
		int i=1;
		if(pos==0)
		{
			insertStart(list,data);
		}
		else
		{
			while(current!=null && i<pos-1)
			{
			current=current.next;
			i++;
				
			}
			if(current==null && i==pos)
			{
				insertLast(list,data);
			}
			else
			{
				newnode.next=current.next;
				newnode.prev=current;
				current.next=newnode;
				newnode.next.prev=newnode;
			}
		}
		return list;
	}
	
	public static void printlist(dualLinkedList list)
	{
		Node current = list.head;
		while(current != null)
		{
			System.out.println(current.data +" ");
			current = current.next;																									
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dualLinkedList list = new dualLinkedList();
		list= insertStart(list,3);
		list= insertStart(list,1);
		list= insertLast(list,4);
		list=insertAt(list,2,1);
		list=insertAt(list,0,0);
		printlist(list);

	}

}

package package2;

import java.util.Currency;
import java.util.Scanner;

class LinkedList
{
	Node head; // head of list

	/* Linked list Node. This inner class is made static so that
	main() can access it */
	static class Node {
		int data;
		Node next;
	
		Node(int d) { data = d; next=null; } // Constructor
	}

	/* This function prints contents of linked list starting from head */
	public void printList()
	{
		Node n = head;
		while (n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	public Node insertfirst(int data,int pos)
	{
		int count=1;
		Node temp;
		Node curr=head;
		Node newnode=new Node(data);
		if(pos==1)
		{
			
			newnode.next=head;
			head=newnode;
		}
		else
		{
			for(temp=head.next;temp!=null;temp=temp.next)
			{
				count++;
				
				if(count==pos)
				{
			
					curr.next=newnode;
					newnode.next=temp;
					break;
				}
				curr=curr.next;
			}
			
		}
		return head;
	}
	public void insertlast(int data)
	{
		Node temp;
		Node newnode=new Node(data);
		for(temp=head;temp!=null;temp=temp.next)
		{
			if(temp.next==null)
			{
				temp.next=newnode;
				break;
			}
		}
	}
	public void delete1(int data)
	{
		Node temp;
		Node cur=null;
		
		
		
		for(temp=head;temp!=null;)
		{
			
			if(temp.data==data)
			{
				if(temp.data==head.data)
				{
					head=head.next;
					temp.next=null;
					break;
				}
				cur.next=temp.next;
				break;
			}
			else{
				cur=temp;
				temp=temp.next;
			}
		}
		
	}

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head	 = new Node(1);
		Scanner scan =new Scanner(System.in);
		Node second	 = new Node(2);
		Node third	 = new Node(3);
		
		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link first node with the second node
		System.out.println("Enter the data and possition:");
		int data=scan.nextInt();
		int pos=scan.nextInt();
		llist.head=llist.insertfirst(data,pos);
		llist.printList();
		
		System.out.println("Enter the data to be inserted at last posstion");
		int data1=scan.nextInt();
		llist.insertlast(data1);
		llist.printList();
		System.out.println("Enter the data to be deleted:");
		int ddata=scan.nextInt();
		llist.delete1(ddata);
		llist.printList();

		
	}
}

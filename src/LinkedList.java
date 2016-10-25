public class LinkedList
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		public Node()
		{	
			this.next = null;
		}
	}
	
	Node head;
	int size = 0;
	
	//Add element at end
	protected void add(int data)
	{
		Node newNode =  new Node(data);
		
		//If head is empty - 1st Node
		if(head==null)
			head = newNode;
		else
		{
			Node tempNode = head;
			
			//Loop till last node
			while(tempNode.next!=null)
				tempNode = tempNode.next;
			tempNode.next = newNode;
		}
		size++;
	}
	
	protected void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	//Delete element from end - return true if element deleted or false if nothing to delete
	protected boolean delete()
	{
		if(size == 0)
			return false;
		else if(size == 1)
		{
			head = null;
			size--;
			return true;
		}	
		else
		{
			Node tempNode = head;
			while(tempNode.next.next!=null)
				tempNode = tempNode.next;
			tempNode.next=null;
			size--;
			return true;
		}
	}
	
	protected boolean deleteByKey(int data)
	{
		if(size == 0)
			return false;
		else
		{	
			if(head.data == data)
			{
				head = head.next;
				size--;
				return true;
			}
			else
			{
				Node currentNode = head.next;
				Node prevNode = head;
				
				while (currentNode.data != data)
				{
					if(currentNode.next!=null)
					{	
						prevNode = currentNode;
						currentNode = currentNode.next;
					}
					else
						return false;
				}
				prevNode.next = currentNode.next;
				return true;
			}
		}
	}
	
	public boolean deleteByPosition(int position)
	{
		if(position > size)
			return false;
		if(position == 1)
		{
			head = head.next;
			size--;
			return true;
		}
		else			
		{
			Node tempNode = head;
			for(int i=0; i<position-2;i++)
				tempNode = tempNode.next;
			tempNode.next = tempNode.next.next;
			size--;
			return true;
		}
	}
	
	public void reverse()
	{
		if(size == 0 || size ==1) //No elements or 1 element
			return;
		else if(size == 2)
		{
			Node tempNode = head;
			head = head.next;
			head.next = tempNode;
			tempNode.next = null;
		}
		else
		{
			Node currentNode = head.next, prevNode = head, nextNode = currentNode.next;

			while(nextNode.next != null)
			{
				prevNode.next = null;
				currentNode.next = prevNode;
				currentNode = nextNode;
				nextNode = nextNode.next;
			}
			prevNode.next = null;
			currentNode.next = prevNode;
			nextNode.next = currentNode;
			head = nextNode;
			
		}
		
		
		
		
	}
	
	public void clear()
	{
		head = null;
		size = 0;
	}
	
	//Print all the elements of a linked list
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		if(size == 0)
			return null;
		else if(size == 1)
			return Integer.toString(head.data);
		else
		{
			Node tempNode = head;
			
			while(tempNode.next!=null)
			{	
				sb.append(tempNode.data+" ");
				tempNode = tempNode.next;
			}		
			sb.append(tempNode.data);
			return sb.toString();
		}
	}
}
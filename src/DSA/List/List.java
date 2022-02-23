package DSA.List;

class Node{

	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
public class List {
	
	Node head;
	
	void insertList(List l, int data)
	{
		//
		Node newNode = new Node(data);
		if(l.head == null)
		{
			newNode.setNext(head);
			head.next = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.setNext(newNode);
		}
	}
	
	void printList(List l)
	{
		//
		Node temp = l.head;
		while(temp.next != null)
		{
			System.out.print(temp.data);
			temp = temp.next;
		}
		
	}
	public static void main(String[] args)
	{
		List l = new List();
		if(l.head == null)
		{
			System.out.print("Pointing to null");
		}
		else {
			System.out.print(l.head.next);
		}
		l.insertList(l,12);
		l.insertList(l,23);
		l.insertList(l,56);
		l.printList(l);
		
		
		
	}
	
}

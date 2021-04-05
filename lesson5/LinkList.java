package lesson5;

public class LinkList {

	Node first=null;
	Node last;
	int size;
	
	
	public LinkList()
	{
		
	}
	public LinkList(String data) {
		first = new Node(data, null);
		size++;
	}
	
	public int get_size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(first==null)
		{
			return true;
		}
		return false;
	}
	
	public void insert(String data) {
		Node n= new Node(data, null);
		if (isEmpty())
			first=n;
		
		else {
			Node temp=first;
			while(temp._next!=null)
			{
				temp=temp._next;
			}
			temp._next=n;
		}
		size++;
			
	}
	
	public void delete() {
		if (isEmpty())
			System.out.println("list is empty");
		else{
			Node temp=first;
			while(temp._next._next!=null)
			{
				temp=temp._next;
			}
			System.out.println("deleted" +temp._next._data+ "from ll");
			temp._next=null;
			size--;
		}
	}
	
	public void delete(String s) {
		if (isEmpty())
			System.out.println("list is empty");
		else{
			Node temp=first;
			//if s is in the first elemet:
			if(temp._data.equals(s)) {
				System.out.println("deleted " +temp._data+ " from ll");
				first=first._next;
				size--;
			}
			
			else {
			while(temp._next._next!=null && !temp._next._data.equals(s))
			{
				temp=temp._next;
			}
			System.out.println("deleted " +temp._next._data+ " from ll");
			temp._next=temp._next._next;
		
			//temp._next=null;
			size--;
			}
		}
		
		
	}
	
	public void print()
	{
		Node temp=first;
		System.out.println(temp);
//		while(temp._next!=null)
//		{
//			temp=temp._next;
//			System.out.println(temp);
//		}
	}
	
	
	public static void main(String[] args) {
		LinkList ll= new LinkList();
		ll.insert("hi");
		ll.insert("welcome");
		ll.insert("to");
		ll.insert("DS");
		
		ll.print();
		
		ll.delete("to");
		
		ll.print();
		
		
				
	}
	
}

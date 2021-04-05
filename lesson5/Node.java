package lesson5;

public class Node {
	
	
	String _data;
	Node _next;
	
	
	public Node (String data , Node next) {
		_data=data;
		_next=next;
	}

	@Override
	public String toString() {
		return "Node [_data=" + _data + ", _next=" + _next + "]";
	}

}

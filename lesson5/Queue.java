package lesson5;

public class Queue {
	
	private int arr[];
	private int size=0;
	private int front=0;
	private int tail=0;
	private int capacity=0;
	
	
	public Queue(int size) {
		this.size=size;
		this.arr= new int[size];
	}
	
	public Queue(int[] arr, int size, int front, int tail, int capacity) {
		
		this.size = size;
		this.arr = new int[size];
		
		this.front = front;
		this.tail = tail;
		this.capacity = capacity;
	}
	
	public boolean isEmpty() {
		if (capacity==0)
			return true;
		return false;
	}
	public boolean isFull() {
		if(capacity ==size) {
			return true;
		}
		return false;
	}
	//remove the front ot the queue 
	public void deQueue() {
		if (isEmpty())
			System.out.println("empty queue");
		else {
			System.out.println("remove" + arr[front]);
			front=(front+1)%size;
			capacity--;
		}
	}
	//add an item to tail of the queue
	public void enQueue(int item) {
		if (isFull())
			System.out.println("Queue is full");
		else {
			System.out.println("insert "+ item);
			arr[tail]=item;
			tail=(tail+1)%size;
			capacity++;
		}
		
	}
	public void getCapacity() {
		System.out.println(capacity);
	}
	//print the queue from front to last
	public void printQueue(){
		
		int ind= front;
		
		for (int i=0;i<size;i++) {
			System.out.print(arr[ind]);
			ind=(ind+1)%size;
				}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		Queue q= new Queue(5);
		q.enQueue(0);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.printQueue();
		
		System.out.println(q.front);
		q.deQueue();
		q.enQueue(5);
		q.printQueue();
		
	}
	

}

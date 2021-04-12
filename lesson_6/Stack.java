package lesson_6;

public class Stack {
	
	final int MAX_SIZE=10;
	int[] arr;
	int curr;
	
	
	public Stack() {
	arr= new int[MAX_SIZE];
	curr=0;
	
	}
	
	public boolean isEmpty() {
		if(curr==0)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(curr==MAX_SIZE)
			return true;
		return false;
	}
// add an element to tje top of the stack uf not full 	
	public void push(int element)
	{
		if(isFull())
			System.out.println("stack is full ");
		else {
			arr[curr]=element;
			curr++;
		}
	}
//return and remove the top of the stack if not empty	
	public int pop() {
		
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else {
		curr--;
		System.out.println("return value"+ arr[curr]);
		return arr[curr];
		}
		
	}
//return the top of the stack if not empty		
public int top() {
		
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else {
		
		System.out.println("return value"+ arr[curr-1]);
		return arr[curr-1];
		}
		
	}

public void clear()
{
	curr=0;
}
public int size()
{
	return curr;
}

public void print()
{
	for(int i=curr-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}

public int delete(int element) {
	if(isEmpty())
	{
		System.out.println("stack is empty");
		return -1;
	}
	else {
		Stack tempStack= new Stack();
		int temp=pop();
		 while(temp!= element && temp!=-1) {
			 tempStack.push(temp);
			 temp=pop();
		 }
		 if(temp==element)
		 {
		 while(!tempStack.isEmpty()) {
			 push(tempStack.pop());
		 }
		 return temp;
		 }
		 else {
		 }
			 while(!tempStack.isEmpty()) {
				 push(tempStack.pop());
		 }
		 return -1;
	}
	
}


public static void main(String[] args) {
	Stack myStack=new Stack();
	myStack.push(1);
	myStack.push(3);
	myStack.push(2);
	myStack.push(5);
	
	myStack.print();
	
	myStack.delete(2);
	myStack.print();
	
}
}

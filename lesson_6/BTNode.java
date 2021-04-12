package lesson_6;

public class BTNode {

	int data;
	BTNode left;
	BTNode right;
	
	public BTNode(int d)
	{
		data=d;
		left=null;
		right=null;
	}
	public void setRight(BTNode r){
	
		
		right=r;
	}
	public void setLeft(BTNode l){
	
		
		left=l;
	}
}

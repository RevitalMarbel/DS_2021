package lesson_6;

public class BTree {

	
	BTNode root;
	int size;
	
	
	public BTree(int d)
	{
		root= new BTNode(d);
		root.setLeft(null);
		root.setRight(null);
	}
	
	
	public void preorder(BTNode root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
	}
	public void inorder(BTNode root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	}
	
	
	public static void main(String[] args) {
		BTree bt= new BTree(5);
		
		BTNode temp= new BTNode(3);
		temp.setLeft(new BTNode(6));
		temp.setRight(new BTNode(7));
		bt.root.setLeft(temp);
		bt.root.setRight(new BTNode(3));
		
		bt.preorder(bt.root);
		System.out.println();
		bt.inorder(bt.root);
	}
}

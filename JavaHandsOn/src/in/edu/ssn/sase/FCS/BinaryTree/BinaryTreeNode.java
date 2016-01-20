package in.edu.ssn.sase.FCS.BinaryTree;

public class BinaryTreeNode {
	private int Data;
	private BinaryTreeNode LeftBTree;
	private BinaryTreeNode RightBTree;
	BinaryTreeNode(int data){
		this.Data=data;
		this.LeftBTree=null;
		this.RightBTree=null;
	}
	public int getData() {
		return Data;
	}
	public void setData(int data) {
		Data = data;
	}
	public BinaryTreeNode getLeftBTree() {
		return LeftBTree;
	}
	public void setLeftBTree(BinaryTreeNode leftBTree) {
		LeftBTree = leftBTree;
	}
	public BinaryTreeNode getRightBTree() {
		return RightBTree;
	}
	public void setRightBTree(BinaryTreeNode rightBTree) {
		RightBTree = rightBTree;
	}

}

package in.edu.ssn.sase.FCS.BinaryTree;

public class CheckBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.setRoot(new BinaryTreeNode(2));
		tree.getRoot().setLeftBTree(new BinaryTreeNode(7));
		tree.getRoot().setRightBTree(new BinaryTreeNode(5));
		tree.getRoot().getLeftBTree().setLeftBTree(new BinaryTreeNode(2));
		tree.getRoot().getLeftBTree().setRightBTree(new BinaryTreeNode(6));
		tree.getRoot().getLeftBTree().getRightBTree().setLeftBTree(new BinaryTreeNode(5));
		tree.getRoot().getLeftBTree().getRightBTree().setRightBTree(new BinaryTreeNode(11));
		tree.getRoot().getRightBTree().setRightBTree(new BinaryTreeNode(9));
		tree.getRoot().getRightBTree().getRightBTree().setLeftBTree(new BinaryTreeNode(4));
		tree.getRoot().getRightBTree().getRightBTree().setRightBTree(new BinaryTreeNode(8));
		tree.getPostOrder(tree.getRoot());
		tree.postFixLoop();
	}
}

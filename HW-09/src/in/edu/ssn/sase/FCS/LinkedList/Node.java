package in.edu.ssn.sase.FCS.LinkedList;

public class Node<T> {

	private T data;
	private Node<T> next;
	public boolean isDeleted;
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public T getData() {
		return data;
	}
	Node(T data)
	{
		this.data=data;
		isDeleted=false;
		this.next=null;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}

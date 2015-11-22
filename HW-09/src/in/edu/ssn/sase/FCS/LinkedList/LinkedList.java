package in.edu.ssn.sase.FCS.LinkedList;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> position;
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public LinkedList() {
		head=new Node<T>(null);
		position=head;
		length=0;
	}
	public void add(T data) {
		position=this.end();
		Node<T> thisNode=new Node<T>(data);
		position.setNext(thisNode);
		position=thisNode;
		length++;
	}
	public Node<T> begin(){
		return head;
	}
	public Node<T> end(){
		position=this.begin();
		while(position.getNext()!=null)
		{
			position=position.getNext();
		}
		return position;
	}
	public void insertAtBeginning(T data) {
		Node<T> temp=this.begin().getNext();
		Node<T> newNode=new Node<T>(data);
		this.begin().setNext(newNode);
		newNode.setNext(temp);
	}
	public void insertAtEnd(T data) {
		Node<T> newNode=new Node<T>(data);
		this.end().getNext().setNext(newNode);
	}
	public void deleteAtEnd() {
		this.end().setDeleted(true);
	}
	public void deleteAtBeginning() {
		this.begin().getNext().setDeleted(true);;
	}
	public Node<T> locate(T data){
		position=this.begin();
		while(position.getNext()!=null)
		{
			if(position.getNext().getData()==data)
			{
				return position;
			}
			else
				position=position.getNext();
		}
		return null;
	}
	public void addNext(T FindData,T InsertData)
	{
		position=locate(FindData).getNext();
		Node<T> tempPosition=position.getNext();
		position.setNext(null);
		this.add(InsertData);
		position.setNext(tempPosition);
	}
	public void addPrevious(T FindData,T InsertData)
	{
		position=locate(FindData);
		Node<T> tempPosition=position.getNext();
		position.setNext(null);
		this.add(InsertData);
		position.setNext(tempPosition);
	}
	public void delete(T data){
		position=locate(data);
		position.getNext().setDeleted(true);
	}
	public void purge(){
		position=this.begin();
		while(position.getNext()!=null){
			if(position.getNext().isDeleted==true){
				position.setNext(position.getNext().getNext());
				length--;
			}
			else
				position=position.getNext();
		}
	}
	public void printList(){
		position=this.begin();
		System.out.print("[ ");
		while(position.getNext()!=null)
		{
			System.out.print(position.getNext().getData()+" ");
			position=position.getNext();
		}
		System.out.println("]");
	}
}

package in.edu.ssn.sase.FCS.hw09.Question2;
public class CircularQueue {

	private int[] elements;
	private int Capacity;
	private int head;
	private int tail;

	public CircularQueue(int queueSize) {
		this.Capacity = queueSize + 1;
		elements = new int[Capacity];
		head = -1;
		tail = -1;
	}

	public synchronized void enQueue(int element) {
		if (head == -1) 
		{
			elements[0] = element;
			head = 0;
			tail = 0;
		} 
		else if (isFull()) 
		{
			System.out.println("Queue is full");
		} 
		else 
		{
			tail = (tail + 1) % Capacity;
			elements[tail] = element;
		}

	}

	public synchronized void deQueue() {
		if (isEmpty()) 
		{
			System.out.println("Queue is empty");
		} 
		else {
			elements[head] = -1;
			head = (head + 1) % Capacity;
		}
	}
	
	public void printQueue(){
		if(isEmpty())
		{
			System.out.println("Queue empty");
			return;
		}
		for(int i = head; i<= tail; i++){
			System.out.print(elements[i]);
		}
	}

	public boolean isEmpty() {
		if (head == -1) 
		{
			return true;
		} 
		else if (head == (tail + 1) % Capacity) {
			return true;
		} 
		else {
			return false;
		}
	}

	public boolean isFull() {
		if (head == (tail + 2) % Capacity) 
		{
			return true;
		}
		return false;
	}

}

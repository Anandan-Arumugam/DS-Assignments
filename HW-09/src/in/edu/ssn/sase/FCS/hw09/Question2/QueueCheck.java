package in.edu.ssn.sase.FCS.hw09.Question2;

public class QueueCheck {

	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue(2);
		circularQueue.enQueue(3);
		circularQueue.enQueue(200);
		circularQueue.enQueue(5);
		circularQueue.printQueue();
		circularQueue.deQueue();
		circularQueue.enQueue(3);
//		circularQueue.printQueue();
//		circularQueue.deQueue();
//		circularQueue.deQueue();

	}

}

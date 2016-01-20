package in.edu.ssn.sase.FCS.LinkedList;

public class CheckList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.addNext(10,40);
		list.addPrevious(20, 90);
		System.out.println("List: ");
		list.printList();
//		list.delete(40);
		list.delete(10);
		list.add(120);
		System.out.println("List After Delete:");
		list.printList();
		System.out.println("List After Purge");
		list.purge();
		list.printList();
		list.add(60);
		list.printList();
		list.delete(20);
		list.purge();
		list.printList();
		list.add(50);
		list.printList();
		list.deleteAtBeginning();
		list.deleteAtEnd();
		System.out.println("List After delete at end and beginning");
		list.printList();
		list.purge();
		System.out.println("List after purge:");
		list.printList();
		System.out.println("After Reverse");
		list.Reverse();
		list.printList();
		System.out.println(list.getLength());
		System.out.println(list.findNodeFromLast(2));
		System.out.println(list.isListLoop());
		System.out.println(list.findNodeFromLastR(list.begin(), 1));
	}
}

package in.edu.ssn.sase.FCS.hw09.Question1;


public class ListCheck {

	public static void main(String[] args) {

		SelfAdjustingList<String> list=new SelfAdjustingList<String>(String.class);
		list.insert("Anand");
		list.insert("Gerrard");
		list.insert("Scholes");
		list.insert("Rooney");
		list.insert("Messi");
		list.insert("Anand");
		list.insert("Anand");
		System.out.println("List :");
		list.printList();
		list.locate("Anand");
		System.out.println("After Locate :");
		list.printList();
		list.locate("Gerrard");
		System.out.println("After Locate :");
		list.printList();
		//		list.next(2);
		list.delete(1);
		list.delete(0);
		list.delete(3);
		list.delete(2);
//		list.delete(4);
		System.out.println("After Delete :");
		list.printList();
		System.out.println("List After purge :");
		list.purge();
		list.printList();
		list.insert("Lampard");
		list.insert("Terry");
		System.out.println("After Insert :");
		list.printList();
		list.purge();
		System.out.println("After Purge : ");
		list.printList();

	}

}
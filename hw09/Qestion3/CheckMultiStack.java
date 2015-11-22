package in.edu.ssn.sase.hw09.Qestion3;

public class CheckMultiStack {

	public static void main(String[] args) {     
		
		MultipleStackArray arrayStack = new MultipleStackArray(2,7);
	 
		arrayStack.push(22, 1);
		arrayStack.push(23, 1);
		arrayStack.push(24, 1);

		arrayStack.push(31, 0);
		arrayStack.push(32, 0);
		arrayStack.push(33, 0);
	    
		arrayStack.pop(0);
		arrayStack.pop(1);
	    
	 }

}

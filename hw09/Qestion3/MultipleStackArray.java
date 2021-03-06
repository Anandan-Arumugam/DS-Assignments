package in.edu.ssn.sase.hw09.Qestion3;

public class MultipleStackArray {
    int elements[]; 
    int top[]; 
    int next[];
               
    int n, k;
    int free; 
    
    public MultipleStackArray(int noOfStack, int arraySize) {
    	
    	// Initialize n and k, and allocate memory for all arrays
        k = noOfStack;
        n = arraySize;
        elements = new int[n];
        top = new int[k];
        next = new int[n];
     
        // Initialize all stacks as empty
        for (int i = 0; i < k; i++)
            top[i] = -1;
     
        // Initialize all spaces as free
        free = 0;
        for (int i=0; i<n-1; i++)
            next[i] = i+1;
        next[n-1] = -1;  // -1 is used to indicate end of free list       
}
    
    boolean isFull()   {  return (free == -1);  }
    
   
 
    // To check whether stack number 'stackNumber' is empty or not
    boolean isEmpty(int sn)  {  return (top[sn] == -1); }
 

public synchronized void push(int data, int stackNumber){
	
	 // Overflow check
    if (isFull())
    {
    	System.out.println("Stack Overflow");
        return;
    }
 
    int i = free;      // Store index of first free slot
 
    // Update index of free slot to index of next slot in free list
    free = next[i];
 
    // Update next of top and then top for stack number 'stackNumber'
    next[i] = top[stackNumber];
    top[stackNumber] = i;
 
    // Put the item in array
    elements[i] = data;
    System.out.println("Data "+ data +" pushed into stack" + stackNumber);
 }

public synchronized void pop(int stackNumber){
	
	// Underflow check
    if (isEmpty(stackNumber))
    {
    	System.out.println("Stack Underflow");
       //  return Integer.MAX_VALUE;
    }
 
 
    // Find index of top item in stack number 'stackNumber'
    int i = top[stackNumber];
 
    top[stackNumber] = next[i];  // Change top to store next of previous top
 
    // Attach the previous top to the beginning of free list
    next[i] = free;
    free = i;
 
    System.out.println("Data "+  elements[i] + " popped from stack" + stackNumber);
}
}

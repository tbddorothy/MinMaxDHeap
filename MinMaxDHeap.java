/* Complete this class to implement a fully functional min-max d-heap. Read the comments to determine what each aspect of the class is supposed to do.
You must add any additional features (methods, references) which may aid you in your task,
BUT you are not allowed to remove or change the names or properties of any of the features you were given.

Importing Java's built in data structures will result in a mark of 0.
*/

public class MinMaxDHeap<T>
{
	public MinMaxDHeap(int d)
	{
		/* Parameter d specifies the order of your min-max heap. If d = 2, you should construct a binary heap, 
		   if d = 3, you should construct a ternary heap, etc. You may implement this constructor to suit your 
		   needs, or you may add additional constructors. This is the constructor which will be used for marking. */
		   this.d = d;
		   this.heap = null;
	}
	
	/* Insertion */
	public void insert(T data, int key)
	{
		/* Insert a Node object according to its key (priority).
			 The Node object has to be initialised with the given data/key values.
		   Refer to the assignment spec for insertion algorithm details. */
		   if(this.heap == null){
			heap = new Node[1];
			heap[0] = new Node<T>(data, key);
			return;
		   }




	}
	
	/* Read-only access */
	public T peekMin()
	{
		/* Return the data of the min priority Node. Min-max heap should not be modified by this function. */
		Node<T> temp = new Node<T>(Integer.MAX_VALUE,0);
		for(int i = 0; i < heap.length; i++){
			if(heap[i].getData() < temp.getData()){
				temp = heap[i];
			}
		}

		return null;
	}
	
	public T peekMax()
	{
		/* Return the data of the max priority Node. Min-max heap should not be modified by this function. */
		return null;
	}
	
	public String toString()
	{
		/* Return a breadth-first traversal representation of the Min-Max d-heap by constructing 
		   a comma-separated string of the data stored in the heap. To construct the string,
       iterate over the heap, and append each Node object by invoking the toString() method.
       NB: The output format should contain no spaces and/or new line characters. 
       Individual nodes must be comma-separated. Eg., if alphabetical characters A, B, and C 
       were stored in the min-max heap in this order, you should return the string "A,B,C" 
       */
		return "";
	}
	
	
	/* Deletion */
	public T deleteMin()
	{
		/* Remove the Node with the min priority, and return its data. 
			 Min-max heap has to be restructured accordingly: see spec for details. */
		return null;
	}
	
	public T deleteMax()
	{
		/* Remove the Node with the max priority, and return its data. 
			 Min-max heap has to be restructured accordingly: see spec for details. */
		return null;
	}
	
	/* Construction */
	public void construct(Node[] arr)
	{
		/* Given an array of Node objects in arbitrary order, construct a min-max heap by 
       applying Floyd's algorithm modified for min-max d-heaps. */
	}
	
	public void changeD(int newD)
	{
		/* Given a new order d, restructure the current min-max d-heap such that it is a d-heap with d = newD. */
		this.d = newD;
	}
		
	/* Clearing */
	public void clear()
	{
		/* Clear the min-max heap by removing all nodes. */
	}
	
	private int d; // The d-order of the min-max d-heap
	private Node[] heap;

	//Helper functions
	private int parentOf(int pos){
		return d*pos/2;
	}

	private int leftOf(int pos){
		return 2*pos*d;
	}

	private int rightOf(int pos){
		return 2*pos*d + 1;
	}

	private boolean terminal(int pos){
		if((pos >= position/2) && (pos <= position)){
			return true;
		}else{
			return false;
		}
	}
}

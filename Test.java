public class Test
{
	public static void main(String[] args)
	{
		// Write code to test your implementation here.
		MinMaxDHeap heap = new MinMaxDHeap(2);
		heap.insert(1,2);
		heap.insert(1,2);
		heap.insert(1,2);
		heap.insert(1,2);
		System.out.println(heap.peekMin());
	}
}

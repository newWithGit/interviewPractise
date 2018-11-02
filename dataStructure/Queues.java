package dataStructure;

/*
1) implement using array default size 16
	a) if full make new array - of 1.75 size - put all elements in it
2) push in end
3) pop from top
	a) for remove re-adjust all elements

*/
public class Queues<T> {
	private static final int DEFAULT_SIZE = 16;
	private strictfp static final float INCREMENT_PERCENT = 1.75;

	T[] queue = null;
	private queueSize = DEFAULT_SIZE;
	// denotes end of queue, so that we don't have to iterate each time to find empty position 
	private int bottom = 0;

	public Queues() { queue = new T[DEFAULT_SIZE]; }

	public Queues(int size) {
		this.queueSize = size;
		queue = new T[size];
	}

	public void push(T t) {
		if (queue != null) {
			// if queue is full then make a new queue and put the elements in it 
			if (isQueueFull()) {
				makeNewArrayAndPutAllElementsInIt(queue);
			}
			// push opertation 
			queue[++bottom] = t;
		} else {
			queue[0] = t;
		}
	}

	public T pop() {
		if (!isQueueEmpty()) {
			return rearrangeQueue();
		}
		return null;
	}

	private void makeNewArrayAndPutAllElementsInIt(T[] queue) {
		int newSize = Math.abs(queueSize * INCREMENT_PERCENT);
		T[] temp = new T[newSize];
		for (int i = 0; i< queue.length; i++) {
			temp[i] = queue[i];
		}
		queue = temp;
	}

	private T rearrangeQueue() {
		T temp = 0;
		temp = queue[0];
		for(int i =0; i<=bottom; i++ ) {
			queue[i] = queue[i+1];
		}
		bottom--;
		return temp;
	}

	private boolean isQueueFull() {
		return bottom == queueSize-1;
	}

	private boolean isQueueEmpty() {
		return bottom == 0;
	}
}
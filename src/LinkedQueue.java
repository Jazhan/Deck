interface QueueInterface <T> {
	
	    public <T>  void enqueue(T anEnter);
	    public <T>  void dequeue();
	    public <T> void getFront();
	    public boolean isEmpty();
	    public void clear();
	}

public abstract class LinkedQueue <T> implements QueueInterface<T>
	{
	private Node firstNode; // references node at front of queue
	private Node lastNode; // references node at back of queue
	public LinkedQueue()
	    {
	        firstNode = null;
	        lastNode = null;
	    } // end default constructor


	private class Node
	    {
	            private T data; // entry in queue
	            private Node next; // link to next node
	            public Node(T initialData, Node initialNext)
	                 {
	                     this.data= initialData;
	                    this.next = initialNext;
	                   }
	            public T getData()
	                 {
	                     return this.data;
	                 }
	       
	            public Node getNext()
	                {
	                   return this.next;
	                }
	       
	             public void setData(T newData)
	                {
	                     this.data = newData;
	                }
	       
	            public void setNext(Node newNext)
	                {
	                      this.next = newNext;
	                }
	        } // end of class Node

	    public void enqueue(T newEntry)
	        {
	            Node newNode = new Node(newEntry, null);
	            if (isEmpty())
	                firstNode = newNode;
	            else
	                lastNode.setNext(newNode);
	            lastNode = newNode;
	        } // end enqueue

	    public T getFront()
	            {
	                T front = null;
	                if (!isEmpty())
	                    front = firstNode.getData();
	                return front;
	               } // end getFront

	    public T dequeue()
	            {
	                    T front = null;
	                    if (!isEmpty())
	                        {
	                                front = firstNode.getData();
	                                firstNode = firstNode.getNext();
	                                if (firstNode == null)
	                                        lastNode = null;
	                         } // end if
	                return front;
	            } // end dequeue

	    public boolean isEmpty()
	            {
	                    return (firstNode == null) && (lastNode == null);
	                } // end isEmpty
	    public void clear()
	            {
	                firstNode = null;
	                lastNode = null;
	            } // end clear
	} //end of class LinkedQueue


package queue;

interface IQueue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyListQueue extends linkedList.MyLinkedList implements IQueue{

	linkedList.MyListNode front;
	linkedList.MyListNode rear;
		
	
	public MyListQueue()
	{
		front = null;
		rear = null;
	}
	
	public void enQueue(String data)
	{
		linkedList.MyListNode newNode;
		if(isEmpty())  //처음 항목
		{
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else
		{
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}
	
	public String deQueue()
	{
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.next;
		if( front == null ){  // 마지막 항목
			rear = null;
		}
		return data;
	}
	
//	public void printAll()
//	{
//		if(isEmpty()){
//			System.out.println("Queue is Empty");
//			return;
//		}
//		linkedList.MyListNode temp = front;
//		while(temp!= null){
//			System.out.print(temp.getData() + "->");
//			temp = temp.next;
//		}
//		System.out.println();
//	}
	
	@Override
	public void printQueue() {
		printAll();
	}
}

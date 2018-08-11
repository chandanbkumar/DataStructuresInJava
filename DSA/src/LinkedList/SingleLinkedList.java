package LinkedList;

public class SingleLinkedList{
	
	Node head;
    
	class Node{
    	int data;
    	Node next;
    	 Node(){
    		 next=null;
    	 }
    }
    
	SingleLinkedList(){
    	head=new Node();
    }
    
    public void addFirst(int data){
    	if(head.next==null) {
    		head.next=new Node();
    		head.data=data;
    	}
    	else{
    		Node n = head;
    		head=new Node();
    		head.next=n;
    		head.data=data;
    	}
    }
    public void displayList(){
    	for(Node i=head;i.next!=null;i=i.next){
    		System.out.println(i.data);
    	}
    }
    
    
    
    

}

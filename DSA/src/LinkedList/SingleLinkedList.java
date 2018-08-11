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
    
    public void addLast(int data){
    	Node i;
    	for(i=head;i.next!=null;i=i.next);
    	i.next=new Node();
    	i.data=data;
    }
    
    public void displayList(){
    	System.out.println(head);
    	for(Node i=head;i.next!=null;i=i.next){
    		System.out.print(i.data+" --> ");
    	}
    }
    
    public void add(int data,int position){
    	int len=length(),ins=0;
    	Node i,j=null;
    	if(position>len+1 || position<=0)  return;
    	else if(position==1) addFirst(data);
    	else if(position==len+1) addLast(data);
    	else{
    		for(i=head;ins!=position-1;i=i.next){
    			ins++;
    			j=i;
    		}
    		j.next=new Node();
    		j.next.data=data;
    		j.next.next=i;
    	}
    }
    
    public int length(){
    	int count=0;
    	for(Node i=head;i.next!=null;i=i.next) count++;
    	return count;
    }
    
    public int search(int data){
    	Node i;
    	int position=0;
    	
    	for(i=head;i.data!=data;i=i.next){
    		position++;
    	}
    	if(position==length()) return -1;
    	return position+1;
    }
    
    public void deleteFirst(){
    	if(head.next==null) return;
    	else{
    		Node i=head;
    		head=head.next;
    		i.next=null;
    		i=null;
    	}
    }
    
    public void deleteLast(){
    	Node i,j=null;
    	for(i=head;i.next!=null;i=i.next){
    		j=i;
    	}
    	j.next=null;
    	i=null;
    }

    public void delete(int data){
    	int pos = search(data),c=1;
    	Node i,j=null;
    	if(pos<0) return;
    	if(pos==1) deleteFirst();
    	else if(pos==length()) deleteLast();
    	else{
    		for(i=head;c<pos;i=i.next){
    			j=i;c++;
    		}
    		j.next=i.next;
    		i.next=null;
    		i=null;
    	}
    	
    }
}
